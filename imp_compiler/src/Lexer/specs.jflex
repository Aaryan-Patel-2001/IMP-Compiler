import java_cup.runtime.*;
import AST.sym;

%% 

%class Lexer                              
%unicode
%cup
%line
%column

%{
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }

    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value); 
    }
%}

Whitespace = [ \t\f\r\n]
Letter = [a-zA-Z]
Digit = [0-9]
Identifier = {Letter}({Digit}|{Letter}|_)*
Integer = "0"|[1-9]{Digit}*
Boolean = true | false



%% 

{Whitespace}  { /* ignore */ }

"="           { return symbol(sym.EQ); }

"<"           { return symbol(sym.LESSTHEN); }

"+"           { return symbol(sym.PLUS); }

"-"           { return symbol(sym.MINUS); }

"*"           { return symbol(sym.MULT); }

"||"          { return symbol(sym.OR); }

"&&"          { return symbol(sym.AND); }

"skip"        { return symbol(sym.SKIP); }

":="          { return symbol(sym.ASSIGN); }

";"           { return symbol(sym.SEMI); }

"if"          { return symbol(sym.IF); }

"then"        { return symbol(sym.THEN); }

"else"        { return symbol(sym.ELSE); }

"while"       { return symbol(sym.WHILE); }

"do"          { return symbol(sym.DO); }

"end"         { return symbol(sym.END); }

"return"      { return symbol(sym.RETURN); }

"{"           { return symbol(sym.LBRACE); }

"}"           { return symbol(sym.RBRACE); }

"high"        { return symbol(sym.HIGH); }

"low"         { return symbol(sym.LOW); }

"int"         { return symbol(sym.TYPE, yytext()); }

"bool"        { return symbol(sym.TYPE, yytext()); }

{Boolean}     { return symbol(sym.BOOLEAN, Boolean.parseBoolean(yytext())); }

{Identifier}  { return symbol(sym.ID, yytext()); }

{Integer}     { return symbol(sym.INTEGER,
Integer.parseInt(yytext())); }

/* error fallback */
[^]           { throw new Error("Illegal character <" + yytext()+">"); }
