
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package AST;

import java_cup.runtime.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\025\000\002\002\003\000\002\002\004\000\002\003" +
    "\003\000\002\003\005\000\002\003\006\000\002\004\005" +
    "\000\002\004\003\000\002\004\007\000\002\004\010\000" +
    "\002\004\007\000\002\004\007\000\002\005\005\000\002" +
    "\005\005\000\002\005\005\000\002\005\005\000\002\005" +
    "\005\000\002\005\005\000\002\005\005\000\002\005\003" +
    "\000\002\005\003\000\002\005\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\061\000\014\004\004\007\012\012\010\031\013\034" +
    "\005\001\002\000\012\002\ufffb\006\ufffb\011\ufffb\015\ufffb" +
    "\001\002\000\004\005\062\001\002\000\004\002\061\001" +
    "\002\000\006\002\001\006\054\001\002\000\010\032\023" +
    "\033\026\034\024\001\002\000\010\002\uffff\006\uffff\015" +
    "\uffff\001\002\000\010\032\023\033\026\034\024\001\002" +
    "\000\004\025\014\001\002\000\006\027\015\030\016\001" +
    "\002\000\004\026\021\001\002\000\004\026\017\001\002" +
    "\000\004\034\020\001\002\000\012\002\ufff7\006\ufff7\011" +
    "\ufff7\015\ufff7\001\002\000\004\034\022\001\002\000\012" +
    "\002\ufff8\006\ufff8\011\ufff8\015\ufff8\001\002\000\034\002" +
    "\uffef\006\uffef\010\uffef\011\uffef\013\uffef\015\uffef\016\uffef" +
    "\017\uffef\020\uffef\021\uffef\022\uffef\023\uffef\024\uffef\001" +
    "\002\000\034\002\uffed\006\uffed\010\uffed\011\uffed\013\uffed" +
    "\015\uffed\016\uffed\017\uffed\020\uffed\021\uffed\022\uffed\023" +
    "\uffed\024\uffed\001\002\000\022\010\031\016\027\017\032" +
    "\020\034\021\035\022\030\023\036\024\033\001\002\000" +
    "\034\002\uffee\006\uffee\010\uffee\011\uffee\013\uffee\015\uffee" +
    "\016\uffee\017\uffee\020\uffee\021\uffee\022\uffee\023\uffee\024" +
    "\uffee\001\002\000\010\032\023\033\026\034\024\001\002" +
    "\000\010\032\023\033\026\034\024\001\002\000\014\004" +
    "\004\007\012\012\010\031\013\034\005\001\002\000\010" +
    "\032\023\033\026\034\024\001\002\000\010\032\023\033" +
    "\026\034\024\001\002\000\010\032\023\033\026\034\024" +
    "\001\002\000\010\032\023\033\026\034\024\001\002\000" +
    "\010\032\023\033\026\034\024\001\002\000\034\002\ufff3" +
    "\006\ufff3\010\ufff3\011\ufff3\013\ufff3\015\ufff3\016\027\017" +
    "\032\020\ufff3\021\ufff3\022\ufff3\023\ufff3\024\033\001\002" +
    "\000\034\002\ufff5\006\ufff5\010\ufff5\011\ufff5\013\ufff5\015" +
    "\ufff5\016\027\017\032\020\ufff5\021\ufff5\022\030\023\036" +
    "\024\033\001\002\000\034\002\ufff6\006\ufff6\010\ufff6\011" +
    "\ufff6\013\ufff6\015\ufff6\016\027\017\032\020\ufff6\021\ufff6" +
    "\022\030\023\036\024\033\001\002\000\034\002\ufff2\006" +
    "\ufff2\010\ufff2\011\ufff2\013\ufff2\015\ufff2\016\027\017\032" +
    "\020\ufff2\021\ufff2\022\ufff2\023\ufff2\024\ufff2\001\002\000" +
    "\034\002\ufff0\006\ufff0\010\ufff0\011\ufff0\013\ufff0\015\ufff0" +
    "\016\ufff0\017\ufff0\020\ufff0\021\ufff0\022\ufff0\023\ufff0\024" +
    "\ufff0\001\002\000\004\011\045\001\002\000\014\004\004" +
    "\007\012\012\010\031\013\034\005\001\002\000\012\002" +
    "\ufff9\006\ufff9\011\ufff9\015\ufff9\001\002\000\034\002\ufff4" +
    "\006\ufff4\010\ufff4\011\ufff4\013\ufff4\015\ufff4\016\027\017" +
    "\032\020\ufff4\021\ufff4\022\ufff4\023\036\024\033\001\002" +
    "\000\034\002\ufff1\006\ufff1\010\ufff1\011\ufff1\013\ufff1\015" +
    "\ufff1\016\ufff1\017\ufff1\020\ufff1\021\ufff1\022\ufff1\023\ufff1" +
    "\024\ufff1\001\002\000\022\013\052\016\027\017\032\020" +
    "\034\021\035\022\030\023\036\024\033\001\002\000\014" +
    "\004\004\007\012\012\010\031\013\034\005\001\002\000" +
    "\006\006\054\015\055\001\002\000\016\004\004\007\012" +
    "\012\010\014\056\031\013\034\005\001\002\000\012\002" +
    "\ufffa\006\ufffa\011\ufffa\015\ufffa\001\002\000\010\032\023" +
    "\033\026\034\024\001\002\000\010\002\ufffe\006\ufffe\015" +
    "\ufffe\001\002\000\026\002\ufffd\006\ufffd\015\ufffd\016\027" +
    "\017\032\020\034\021\035\022\030\023\036\024\033\001" +
    "\002\000\004\002\000\001\002\000\010\032\023\033\026" +
    "\034\024\001\002\000\030\002\ufffc\006\ufffc\011\ufffc\015" +
    "\ufffc\016\027\017\032\020\034\021\035\022\030\023\036" +
    "\024\033\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\061\000\010\002\005\003\006\004\010\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\005\050\001\001\000\002\001\001\000" +
    "\004\005\024\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\005\047\001\001\000\004\005\046\001\001" +
    "\000\004\004\043\001\001\000\004\005\042\001\001\000" +
    "\004\005\041\001\001\000\004\005\040\001\001\000\004" +
    "\005\037\001\001\000\004\005\036\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\004\045\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\006\003\052\004\010\001\001\000" +
    "\002\001\001\000\004\004\056\001\001\000\002\001\001" +
    "\000\004\005\057\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\005\062\001\001\000\002" +
    "\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // program ::= command_list 
            {
              ProgramNode RESULT =null;
		int pleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int pright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		CommandNode p = (CommandNode)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new ProgramNode(new Node[] { p }); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("program",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= program EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		ProgramNode start_val = (ProgramNode)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // command_list ::= command 
            {
              CommandNode RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		CommandNode c = (CommandNode)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = c; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("command_list",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // command_list ::= command_list SEMI command 
            {
              CommandNode RESULT =null;
		int c1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int c1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		CommandNode c1 = (CommandNode)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int c2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int c2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		CommandNode c2 = (CommandNode)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new SeqNode(new Node[] { c1, c2 }); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("command_list",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // command_list ::= command_list SEMI RETURN expr 
            {
              CommandNode RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		CommandNode c = (CommandNode)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		ExpressionNode e = (ExpressionNode)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new SeqNode(new Node[] { c, new ReturnNode(e) }); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("command_list",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // command ::= ID ASSIGN expr 
            {
              CommandNode RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		ExpressionNode e = (ExpressionNode)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new AssignNode(new VarNameNode(i), e); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("command",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // command ::= SKIP 
            {
              CommandNode RESULT =null;
		 RESULT = new SkipcmdNode(); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("command",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // command ::= WHILE expr DO command_list END 
            {
              CommandNode RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		ExpressionNode e = (ExpressionNode)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		CommandNode c = (CommandNode)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new WhileNode(e, c); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("command",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // command ::= IF expr THEN command ELSE command 
            {
              CommandNode RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		ExpressionNode e = (ExpressionNode)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int c1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int c1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		CommandNode c1 = (CommandNode)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int c2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int c2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		CommandNode c2 = (CommandNode)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new IfNode(e, c1, c2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("command",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // command ::= TYPE LBRACE HIGH RBRACE ID 
            {
              CommandNode RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		String t = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int Hleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int Hright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object H = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new VarDeclNode(i, true, t); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("command",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // command ::= TYPE LBRACE LOW RBRACE ID 
            {
              CommandNode RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		String t = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int Lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int Lright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object L = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new VarDeclNode(i, false, t); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("command",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // expr ::= expr PLUS expr 
            {
              ExpressionNode RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		ExpressionNode e1 = (ExpressionNode)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		ExpressionNode e2 = (ExpressionNode)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new BinOpNode("+", e1, e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // expr ::= expr MINUS expr 
            {
              ExpressionNode RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		ExpressionNode e1 = (ExpressionNode)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		ExpressionNode e2 = (ExpressionNode)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new BinOpNode("-", e1, e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // expr ::= expr MULT expr 
            {
              ExpressionNode RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		ExpressionNode e1 = (ExpressionNode)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		ExpressionNode e2 = (ExpressionNode)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new BinOpNode("*", e1, e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // expr ::= expr OR expr 
            {
              ExpressionNode RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		ExpressionNode e1 = (ExpressionNode)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		ExpressionNode e2 = (ExpressionNode)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new BinOpNode("||", e1, e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // expr ::= expr AND expr 
            {
              ExpressionNode RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		ExpressionNode e1 = (ExpressionNode)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		ExpressionNode e2 = (ExpressionNode)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new BinOpNode("&&", e1, e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // expr ::= expr EQ expr 
            {
              ExpressionNode RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		ExpressionNode e1 = (ExpressionNode)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		ExpressionNode e2 = (ExpressionNode)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new BinOpNode("==", e1, e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // expr ::= expr LESSTHEN expr 
            {
              ExpressionNode RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		ExpressionNode e1 = (ExpressionNode)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		ExpressionNode e2 = (ExpressionNode)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new BinOpNode("<", e1, e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // expr ::= INTEGER 
            {
              ExpressionNode RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer n = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new IntValueNode(n); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // expr ::= BOOLEAN 
            {
              ExpressionNode RESULT =null;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Boolean b = (Boolean)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new BoolValueNode(b); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // expr ::= ID 
            {
              ExpressionNode RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new VarNameNode(i); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
