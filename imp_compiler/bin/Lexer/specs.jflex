import java_cup.runtime.*;

%% 

%class Lexer                              
%unicode
%cup
%line
%column

%{
 enum TokenType {
 ID,
 INT,
 BOOL,
 TYPE,
 HIGH,
 LOW,
 LBRACE,
 RBRACE,
 COLON,
 PLUS,
 TIMES,
 LESSTHEN,
 EQ,
 SKIP, 
 ASSIGN,
 SEMICOLON,
 IF, 
 THEN,
 ELSE,
 WHILE,
 Do,
 RETURN
}

 class Token {
  TokenType type;
  Object attribute; 
  Token(TokenType tt) {
   type = tt; attribute = null;
  }
  Token(TokenType tt, Object attr) {
   type = tt; attribute = attr;
  }
  public String toString() {
   return "" + type + "(" + attribute + ")";
  }
 }
 public int lineNumber() { return yyline + 1; }
 public int column() { return yycolumn + 1; }
%}

Whitespace = [ \t\f\r\n]
Letter = [a-zA-Z]
Digit = [0-9]
Identifier = {Letter}({Digit}|{Letter}|_)*
Integer = "0"|"-"?[1-9]{Digit}*
Boolean = true | false



%% 

{Whitespace}  { /* ignore */ }

"="           { return new Token(TokenType.EQ); }

"<"           { return new Token(TokenType.LESSTHEN); }

"skip"        { return new Token(TokenType.SKIP); }

":="          { return new Token(TokenType.ASSIGN); }

";"           { return new Token(TokenType.SEMICOLON); }

"if"          { return new Token(TokenType.IF); }

"then"        { return new Token(TokenType.THEN); }

"else"        { return new Token(TokenType.ELSE); }

"while"       { return new Token(TokenType.WHILE); }

"do"          { return new Token(TokenType.DO); }

"return"      { return new Token(TokenType.RETURN); }

"{"           { return new Token(TokenType.LBRACE); }

"}"           { return new Token(TokenType.RBRACE); }

"high"        { return new Token(TokenType.HIGH); }

"low"         { return new Token(TokenType.LOW); }

"int"         { return new Token(TokenType.TYPE, "INT"); }

"bool"        { return new Token(TokenType.TYPE, "BOOL"); }

{Identifier}  { return new Token(TokenType.ID, yytext()); }

{Integer}     { return new Token(TokenType.INT,
Integer.parseInt(yytext())); }

{Boolean}     { return new Token(TokenType.BOOL, yytext()); }
