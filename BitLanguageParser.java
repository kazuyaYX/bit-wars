// $ANTLR 3.5.2 E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g 2015-08-21 16:59:44

	package bitwars;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class BitLanguageParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADDEXP", "ADDOP", "COMPSMTM", 
		"DECL", "DECLSTMT", "EXP", "EXPSTMT", "FACTOR", "ID", "IFSTMT", "MULOP", 
		"NUM", "PROG", "RELOP", "RETURNSTMT", "REWORD", "SIMEXP", "STMT", "STMTLIST", 
		"TERM", "VAR", "WHILESTMT", "WS", "'!='", "'%'", "'&&'", "'('", "')'", 
		"'*'", "'+'", "','", "'-'", "'/'", "';'", "'<'", "'<='", "'='", "'=='", 
		"'>'", "'>='", "'RANDOM'", "'['", "']'", "'else'", "'if'", "'int'", "'return'", 
		"'while'", "'{'", "'||'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int ADDEXP=4;
	public static final int ADDOP=5;
	public static final int COMPSMTM=6;
	public static final int DECL=7;
	public static final int DECLSTMT=8;
	public static final int EXP=9;
	public static final int EXPSTMT=10;
	public static final int FACTOR=11;
	public static final int ID=12;
	public static final int IFSTMT=13;
	public static final int MULOP=14;
	public static final int NUM=15;
	public static final int PROG=16;
	public static final int RELOP=17;
	public static final int RETURNSTMT=18;
	public static final int REWORD=19;
	public static final int SIMEXP=20;
	public static final int STMT=21;
	public static final int STMTLIST=22;
	public static final int TERM=23;
	public static final int VAR=24;
	public static final int WHILESTMT=25;
	public static final int WS=26;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public BitLanguageParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public BitLanguageParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return BitLanguageParser.tokenNames; }
	@Override public String getGrammarFileName() { return "E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g"; }


	public static class program_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "program"
	// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:23:1: program : statement_list -> ^( PROG statement_list ) ;
	public final BitLanguageParser.program_return program() throws RecognitionException {
		BitLanguageParser.program_return retval = new BitLanguageParser.program_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope statement_list1 =null;

		RewriteRuleSubtreeStream stream_statement_list=new RewriteRuleSubtreeStream(adaptor,"rule statement_list");

		try {
			// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:23:9: ( statement_list -> ^( PROG statement_list ) )
			// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:24:1: statement_list
			{
			pushFollow(FOLLOW_statement_list_in_program95);
			statement_list1=statement_list();
			state._fsp--;

			stream_statement_list.add(statement_list1.getTree());
			// AST REWRITE
			// elements: statement_list
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 24:16: -> ^( PROG statement_list )
			{
				// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:24:18: ^( PROG statement_list )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROG, "PROG"), root_1);
				adaptor.addChild(root_1, stream_statement_list.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {

				throw re;

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"


	public static class statement_list_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "statement_list"
	// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:28:1: statement_list : ( statement )+ -> ^( STMTLIST ( statement )+ ) ;
	public final BitLanguageParser.statement_list_return statement_list() throws RecognitionException {
		BitLanguageParser.statement_list_return retval = new BitLanguageParser.statement_list_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope statement2 =null;

		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");

		try {
			// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:28:16: ( ( statement )+ -> ^( STMTLIST ( statement )+ ) )
			// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:29:1: ( statement )+
			{
			// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:29:1: ( statement )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ID||(LA1_0 >= 48 && LA1_0 <= 52)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:29:1: statement
					{
					pushFollow(FOLLOW_statement_in_statement_list114);
					statement2=statement();
					state._fsp--;

					stream_statement.add(statement2.getTree());
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			// AST REWRITE
			// elements: statement
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 29:12: -> ^( STMTLIST ( statement )+ )
			{
				// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:29:14: ^( STMTLIST ( statement )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STMTLIST, "STMTLIST"), root_1);
				if ( !(stream_statement.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_statement.hasNext() ) {
					adaptor.addChild(root_1, stream_statement.nextTree());
				}
				stream_statement.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {

				throw re;

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statement_list"


	public static class statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:33:1: statement : ( declaration_stmt -> ^( STMT declaration_stmt ) | expression_stmt -> ^( STMT expression_stmt ) | compound_stmt -> ^( STMT compound_stmt ) | if_stmt -> ^( STMT if_stmt ) | iteration_stmt -> ^( STMT iteration_stmt ) | return_stmt -> ^( STMT return_stmt ) );
	public final BitLanguageParser.statement_return statement() throws RecognitionException {
		BitLanguageParser.statement_return retval = new BitLanguageParser.statement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope declaration_stmt3 =null;
		ParserRuleReturnScope expression_stmt4 =null;
		ParserRuleReturnScope compound_stmt5 =null;
		ParserRuleReturnScope if_stmt6 =null;
		ParserRuleReturnScope iteration_stmt7 =null;
		ParserRuleReturnScope return_stmt8 =null;

		RewriteRuleSubtreeStream stream_iteration_stmt=new RewriteRuleSubtreeStream(adaptor,"rule iteration_stmt");
		RewriteRuleSubtreeStream stream_return_stmt=new RewriteRuleSubtreeStream(adaptor,"rule return_stmt");
		RewriteRuleSubtreeStream stream_declaration_stmt=new RewriteRuleSubtreeStream(adaptor,"rule declaration_stmt");
		RewriteRuleSubtreeStream stream_if_stmt=new RewriteRuleSubtreeStream(adaptor,"rule if_stmt");
		RewriteRuleSubtreeStream stream_compound_stmt=new RewriteRuleSubtreeStream(adaptor,"rule compound_stmt");
		RewriteRuleSubtreeStream stream_expression_stmt=new RewriteRuleSubtreeStream(adaptor,"rule expression_stmt");

		try {
			// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:33:11: ( declaration_stmt -> ^( STMT declaration_stmt ) | expression_stmt -> ^( STMT expression_stmt ) | compound_stmt -> ^( STMT compound_stmt ) | if_stmt -> ^( STMT if_stmt ) | iteration_stmt -> ^( STMT iteration_stmt ) | return_stmt -> ^( STMT return_stmt ) )
			int alt2=6;
			switch ( input.LA(1) ) {
			case 49:
				{
				alt2=1;
				}
				break;
			case ID:
				{
				alt2=2;
				}
				break;
			case 52:
				{
				alt2=3;
				}
				break;
			case 48:
				{
				alt2=4;
				}
				break;
			case 51:
				{
				alt2=5;
				}
				break;
			case 50:
				{
				alt2=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:34:1: declaration_stmt
					{
					pushFollow(FOLLOW_declaration_stmt_in_statement135);
					declaration_stmt3=declaration_stmt();
					state._fsp--;

					stream_declaration_stmt.add(declaration_stmt3.getTree());
					// AST REWRITE
					// elements: declaration_stmt
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 34:18: -> ^( STMT declaration_stmt )
					{
						// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:34:20: ^( STMT declaration_stmt )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STMT, "STMT"), root_1);
						adaptor.addChild(root_1, stream_declaration_stmt.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:35:3: expression_stmt
					{
					pushFollow(FOLLOW_expression_stmt_in_statement146);
					expression_stmt4=expression_stmt();
					state._fsp--;

					stream_expression_stmt.add(expression_stmt4.getTree());
					// AST REWRITE
					// elements: expression_stmt
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 35:19: -> ^( STMT expression_stmt )
					{
						// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:35:21: ^( STMT expression_stmt )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STMT, "STMT"), root_1);
						adaptor.addChild(root_1, stream_expression_stmt.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:36:3: compound_stmt
					{
					pushFollow(FOLLOW_compound_stmt_in_statement157);
					compound_stmt5=compound_stmt();
					state._fsp--;

					stream_compound_stmt.add(compound_stmt5.getTree());
					// AST REWRITE
					// elements: compound_stmt
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 36:17: -> ^( STMT compound_stmt )
					{
						// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:36:19: ^( STMT compound_stmt )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STMT, "STMT"), root_1);
						adaptor.addChild(root_1, stream_compound_stmt.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:37:3: if_stmt
					{
					pushFollow(FOLLOW_if_stmt_in_statement168);
					if_stmt6=if_stmt();
					state._fsp--;

					stream_if_stmt.add(if_stmt6.getTree());
					// AST REWRITE
					// elements: if_stmt
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 37:11: -> ^( STMT if_stmt )
					{
						// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:37:13: ^( STMT if_stmt )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STMT, "STMT"), root_1);
						adaptor.addChild(root_1, stream_if_stmt.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:38:3: iteration_stmt
					{
					pushFollow(FOLLOW_iteration_stmt_in_statement179);
					iteration_stmt7=iteration_stmt();
					state._fsp--;

					stream_iteration_stmt.add(iteration_stmt7.getTree());
					// AST REWRITE
					// elements: iteration_stmt
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 38:18: -> ^( STMT iteration_stmt )
					{
						// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:38:20: ^( STMT iteration_stmt )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STMT, "STMT"), root_1);
						adaptor.addChild(root_1, stream_iteration_stmt.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:39:3: return_stmt
					{
					pushFollow(FOLLOW_return_stmt_in_statement190);
					return_stmt8=return_stmt();
					state._fsp--;

					stream_return_stmt.add(return_stmt8.getTree());
					// AST REWRITE
					// elements: return_stmt
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 39:15: -> ^( STMT return_stmt )
					{
						// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:39:17: ^( STMT return_stmt )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STMT, "STMT"), root_1);
						adaptor.addChild(root_1, stream_return_stmt.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {

				throw re;

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statement"


	public static class declaration_stmt_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "declaration_stmt"
	// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:43:1: declaration_stmt : ( declaration )+ -> ^( DECLSTMT ( declaration )+ ) ;
	public final BitLanguageParser.declaration_stmt_return declaration_stmt() throws RecognitionException {
		BitLanguageParser.declaration_stmt_return retval = new BitLanguageParser.declaration_stmt_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope declaration9 =null;

		RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");

		try {
			// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:43:18: ( ( declaration )+ -> ^( DECLSTMT ( declaration )+ ) )
			// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:44:1: ( declaration )+
			{
			// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:44:1: ( declaration )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==49) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:44:1: declaration
					{
					pushFollow(FOLLOW_declaration_in_declaration_stmt208);
					declaration9=declaration();
					state._fsp--;

					stream_declaration.add(declaration9.getTree());
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			// AST REWRITE
			// elements: declaration
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 44:15: -> ^( DECLSTMT ( declaration )+ )
			{
				// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:44:17: ^( DECLSTMT ( declaration )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLSTMT, "DECLSTMT"), root_1);
				if ( !(stream_declaration.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_declaration.hasNext() ) {
					adaptor.addChild(root_1, stream_declaration.nextTree());
				}
				stream_declaration.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {

				throw re;

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declaration_stmt"


	public static class declaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "declaration"
	// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:48:1: declaration : ( 'int' ID ( '=' additive_expression )? ';' -> ^( DECL 'int' ID ( '=' additive_expression )? ';' ) | 'int' ID '[' NUM ']' ( '=' '{' ( additive_expression ',' )* '}' )? ';' -> ^( DECL 'int' ID '[' NUM ']' ( '=' '{' ( additive_expression ',' )* '}' )? ';' ) );
	public final BitLanguageParser.declaration_return declaration() throws RecognitionException {
		BitLanguageParser.declaration_return retval = new BitLanguageParser.declaration_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal10=null;
		Token ID11=null;
		Token char_literal12=null;
		Token char_literal14=null;
		Token string_literal15=null;
		Token ID16=null;
		Token char_literal17=null;
		Token NUM18=null;
		Token char_literal19=null;
		Token char_literal20=null;
		Token char_literal21=null;
		Token char_literal23=null;
		Token char_literal24=null;
		Token char_literal25=null;
		ParserRuleReturnScope additive_expression13 =null;
		ParserRuleReturnScope additive_expression22 =null;

		CommonTree string_literal10_tree=null;
		CommonTree ID11_tree=null;
		CommonTree char_literal12_tree=null;
		CommonTree char_literal14_tree=null;
		CommonTree string_literal15_tree=null;
		CommonTree ID16_tree=null;
		CommonTree char_literal17_tree=null;
		CommonTree NUM18_tree=null;
		CommonTree char_literal19_tree=null;
		CommonTree char_literal20_tree=null;
		CommonTree char_literal21_tree=null;
		CommonTree char_literal23_tree=null;
		CommonTree char_literal24_tree=null;
		CommonTree char_literal25_tree=null;
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleTokenStream stream_NUM=new RewriteRuleTokenStream(adaptor,"token NUM");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleSubtreeStream stream_additive_expression=new RewriteRuleSubtreeStream(adaptor,"rule additive_expression");

		try {
			// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:48:13: ( 'int' ID ( '=' additive_expression )? ';' -> ^( DECL 'int' ID ( '=' additive_expression )? ';' ) | 'int' ID '[' NUM ']' ( '=' '{' ( additive_expression ',' )* '}' )? ';' -> ^( DECL 'int' ID '[' NUM ']' ( '=' '{' ( additive_expression ',' )* '}' )? ';' ) )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==49) ) {
				int LA7_1 = input.LA(2);
				if ( (LA7_1==ID) ) {
					int LA7_2 = input.LA(3);
					if ( (LA7_2==45) ) {
						alt7=2;
					}
					else if ( (LA7_2==37||LA7_2==40) ) {
						alt7=1;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 7, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 7, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:49:1: 'int' ID ( '=' additive_expression )? ';'
					{
					string_literal10=(Token)match(input,49,FOLLOW_49_in_declaration230);  
					stream_49.add(string_literal10);

					ID11=(Token)match(input,ID,FOLLOW_ID_in_declaration231);  
					stream_ID.add(ID11);

					// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:49:8: ( '=' additive_expression )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==40) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:49:9: '=' additive_expression
							{
							char_literal12=(Token)match(input,40,FOLLOW_40_in_declaration233);  
							stream_40.add(char_literal12);

							pushFollow(FOLLOW_additive_expression_in_declaration234);
							additive_expression13=additive_expression();
							state._fsp--;

							stream_additive_expression.add(additive_expression13.getTree());
							}
							break;

					}

					char_literal14=(Token)match(input,37,FOLLOW_37_in_declaration237);  
					stream_37.add(char_literal14);

					// AST REWRITE
					// elements: ID, additive_expression, 49, 37, 40
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 50:3: -> ^( DECL 'int' ID ( '=' additive_expression )? ';' )
					{
						// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:50:3: ^( DECL 'int' ID ( '=' additive_expression )? ';' )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECL, "DECL"), root_1);
						adaptor.addChild(root_1, stream_49.nextNode());
						adaptor.addChild(root_1, stream_ID.nextNode());
						// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:50:17: ( '=' additive_expression )?
						if ( stream_additive_expression.hasNext()||stream_40.hasNext() ) {
							adaptor.addChild(root_1, stream_40.nextNode());
							adaptor.addChild(root_1, stream_additive_expression.nextTree());
						}
						stream_additive_expression.reset();
						stream_40.reset();

						adaptor.addChild(root_1, stream_37.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:51:3: 'int' ID '[' NUM ']' ( '=' '{' ( additive_expression ',' )* '}' )? ';'
					{
					string_literal15=(Token)match(input,49,FOLLOW_49_in_declaration257);  
					stream_49.add(string_literal15);

					ID16=(Token)match(input,ID,FOLLOW_ID_in_declaration258);  
					stream_ID.add(ID16);

					char_literal17=(Token)match(input,45,FOLLOW_45_in_declaration259);  
					stream_45.add(char_literal17);

					NUM18=(Token)match(input,NUM,FOLLOW_NUM_in_declaration260);  
					stream_NUM.add(NUM18);

					char_literal19=(Token)match(input,46,FOLLOW_46_in_declaration261);  
					stream_46.add(char_literal19);

					// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:51:19: ( '=' '{' ( additive_expression ',' )* '}' )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==40) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:51:20: '=' '{' ( additive_expression ',' )* '}'
							{
							char_literal20=(Token)match(input,40,FOLLOW_40_in_declaration263);  
							stream_40.add(char_literal20);

							char_literal21=(Token)match(input,52,FOLLOW_52_in_declaration264);  
							stream_52.add(char_literal21);

							// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:51:26: ( additive_expression ',' )*
							loop5:
							while (true) {
								int alt5=2;
								int LA5_0 = input.LA(1);
								if ( (LA5_0==ID||LA5_0==NUM||LA5_0==30||LA5_0==44) ) {
									alt5=1;
								}

								switch (alt5) {
								case 1 :
									// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:51:27: additive_expression ','
									{
									pushFollow(FOLLOW_additive_expression_in_declaration266);
									additive_expression22=additive_expression();
									state._fsp--;

									stream_additive_expression.add(additive_expression22.getTree());
									char_literal23=(Token)match(input,34,FOLLOW_34_in_declaration267);  
									stream_34.add(char_literal23);

									}
									break;

								default :
									break loop5;
								}
							}

							char_literal24=(Token)match(input,54,FOLLOW_54_in_declaration270);  
							stream_54.add(char_literal24);

							}
							break;

					}

					char_literal25=(Token)match(input,37,FOLLOW_37_in_declaration273);  
					stream_37.add(char_literal25);

					// AST REWRITE
					// elements: 40, 52, 45, 46, additive_expression, 49, 54, 34, NUM, ID, 37
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 52:3: -> ^( DECL 'int' ID '[' NUM ']' ( '=' '{' ( additive_expression ',' )* '}' )? ';' )
					{
						// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:52:3: ^( DECL 'int' ID '[' NUM ']' ( '=' '{' ( additive_expression ',' )* '}' )? ';' )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECL, "DECL"), root_1);
						adaptor.addChild(root_1, stream_49.nextNode());
						adaptor.addChild(root_1, stream_ID.nextNode());
						adaptor.addChild(root_1, stream_45.nextNode());
						adaptor.addChild(root_1, stream_NUM.nextNode());
						adaptor.addChild(root_1, stream_46.nextNode());
						// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:52:26: ( '=' '{' ( additive_expression ',' )* '}' )?
						if ( stream_40.hasNext()||stream_52.hasNext()||stream_additive_expression.hasNext()||stream_54.hasNext()||stream_34.hasNext() ) {
							adaptor.addChild(root_1, stream_40.nextNode());
							adaptor.addChild(root_1, stream_52.nextNode());
							// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:52:33: ( additive_expression ',' )*
							while ( stream_additive_expression.hasNext()||stream_34.hasNext() ) {
								adaptor.addChild(root_1, stream_additive_expression.nextTree());
								adaptor.addChild(root_1, stream_34.nextNode());
							}
							stream_additive_expression.reset();
							stream_34.reset();

							adaptor.addChild(root_1, stream_54.nextNode());
						}
						stream_40.reset();
						stream_52.reset();
						stream_additive_expression.reset();
						stream_54.reset();
						stream_34.reset();

						adaptor.addChild(root_1, stream_37.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {

				throw re;

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declaration"


	public static class compound_stmt_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "compound_stmt"
	// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:56:1: compound_stmt : '{' statement_list '}' -> ^( COMPSMTM '{' statement_list '}' ) ;
	public final BitLanguageParser.compound_stmt_return compound_stmt() throws RecognitionException {
		BitLanguageParser.compound_stmt_return retval = new BitLanguageParser.compound_stmt_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal26=null;
		Token char_literal28=null;
		ParserRuleReturnScope statement_list27 =null;

		CommonTree char_literal26_tree=null;
		CommonTree char_literal28_tree=null;
		RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_statement_list=new RewriteRuleSubtreeStream(adaptor,"rule statement_list");

		try {
			// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:56:15: ( '{' statement_list '}' -> ^( COMPSMTM '{' statement_list '}' ) )
			// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:57:1: '{' statement_list '}'
			{
			char_literal26=(Token)match(input,52,FOLLOW_52_in_compound_stmt309);  
			stream_52.add(char_literal26);

			pushFollow(FOLLOW_statement_list_in_compound_stmt310);
			statement_list27=statement_list();
			state._fsp--;

			stream_statement_list.add(statement_list27.getTree());
			char_literal28=(Token)match(input,54,FOLLOW_54_in_compound_stmt311);  
			stream_54.add(char_literal28);

			// AST REWRITE
			// elements: statement_list, 54, 52
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 57:22: -> ^( COMPSMTM '{' statement_list '}' )
			{
				// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:57:24: ^( COMPSMTM '{' statement_list '}' )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPSMTM, "COMPSMTM"), root_1);
				adaptor.addChild(root_1, stream_52.nextNode());
				adaptor.addChild(root_1, stream_statement_list.nextTree());
				adaptor.addChild(root_1, stream_54.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {

				throw re;

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "compound_stmt"


	public static class if_stmt_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "if_stmt"
	// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:61:1: if_stmt : 'if' '(' simple_expression ')' statement ( 'else' statement )? -> ^( IFSTMT 'if' '(' simple_expression ')' statement ( 'else' statement )? ) ;
	public final BitLanguageParser.if_stmt_return if_stmt() throws RecognitionException {
		BitLanguageParser.if_stmt_return retval = new BitLanguageParser.if_stmt_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal29=null;
		Token char_literal30=null;
		Token char_literal32=null;
		Token string_literal34=null;
		ParserRuleReturnScope simple_expression31 =null;
		ParserRuleReturnScope statement33 =null;
		ParserRuleReturnScope statement35 =null;

		CommonTree string_literal29_tree=null;
		CommonTree char_literal30_tree=null;
		CommonTree char_literal32_tree=null;
		CommonTree string_literal34_tree=null;
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
		RewriteRuleSubtreeStream stream_simple_expression=new RewriteRuleSubtreeStream(adaptor,"rule simple_expression");

		try {
			// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:61:9: ( 'if' '(' simple_expression ')' statement ( 'else' statement )? -> ^( IFSTMT 'if' '(' simple_expression ')' statement ( 'else' statement )? ) )
			// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:62:1: 'if' '(' simple_expression ')' statement ( 'else' statement )?
			{
			string_literal29=(Token)match(input,48,FOLLOW_48_in_if_stmt332);  
			stream_48.add(string_literal29);

			char_literal30=(Token)match(input,30,FOLLOW_30_in_if_stmt333);  
			stream_30.add(char_literal30);

			pushFollow(FOLLOW_simple_expression_in_if_stmt334);
			simple_expression31=simple_expression();
			state._fsp--;

			stream_simple_expression.add(simple_expression31.getTree());
			char_literal32=(Token)match(input,31,FOLLOW_31_in_if_stmt335);  
			stream_31.add(char_literal32);

			pushFollow(FOLLOW_statement_in_if_stmt336);
			statement33=statement();
			state._fsp--;

			stream_statement.add(statement33.getTree());
			// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:62:37: ( 'else' statement )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==47) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:62:38: 'else' statement
					{
					string_literal34=(Token)match(input,47,FOLLOW_47_in_if_stmt338);  
					stream_47.add(string_literal34);

					pushFollow(FOLLOW_statement_in_if_stmt339);
					statement35=statement();
					state._fsp--;

					stream_statement.add(statement35.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: simple_expression, 30, statement, 47, 31, 48, statement
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 62:56: -> ^( IFSTMT 'if' '(' simple_expression ')' statement ( 'else' statement )? )
			{
				// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:62:58: ^( IFSTMT 'if' '(' simple_expression ')' statement ( 'else' statement )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IFSTMT, "IFSTMT"), root_1);
				adaptor.addChild(root_1, stream_48.nextNode());
				adaptor.addChild(root_1, stream_30.nextNode());
				adaptor.addChild(root_1, stream_simple_expression.nextTree());
				adaptor.addChild(root_1, stream_31.nextNode());
				adaptor.addChild(root_1, stream_statement.nextTree());
				// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:62:103: ( 'else' statement )?
				if ( stream_statement.hasNext()||stream_47.hasNext() ) {
					adaptor.addChild(root_1, stream_47.nextNode());
					adaptor.addChild(root_1, stream_statement.nextTree());
				}
				stream_statement.reset();
				stream_47.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {

				throw re;

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "if_stmt"


	public static class iteration_stmt_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "iteration_stmt"
	// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:66:1: iteration_stmt : 'while' '(' simple_expression ')' statement -> ^( WHILESTMT 'while' '(' simple_expression ')' statement ) ;
	public final BitLanguageParser.iteration_stmt_return iteration_stmt() throws RecognitionException {
		BitLanguageParser.iteration_stmt_return retval = new BitLanguageParser.iteration_stmt_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal36=null;
		Token char_literal37=null;
		Token char_literal39=null;
		ParserRuleReturnScope simple_expression38 =null;
		ParserRuleReturnScope statement40 =null;

		CommonTree string_literal36_tree=null;
		CommonTree char_literal37_tree=null;
		CommonTree char_literal39_tree=null;
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
		RewriteRuleSubtreeStream stream_simple_expression=new RewriteRuleSubtreeStream(adaptor,"rule simple_expression");

		try {
			// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:66:16: ( 'while' '(' simple_expression ')' statement -> ^( WHILESTMT 'while' '(' simple_expression ')' statement ) )
			// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:67:1: 'while' '(' simple_expression ')' statement
			{
			string_literal36=(Token)match(input,51,FOLLOW_51_in_iteration_stmt369);  
			stream_51.add(string_literal36);

			char_literal37=(Token)match(input,30,FOLLOW_30_in_iteration_stmt370);  
			stream_30.add(char_literal37);

			pushFollow(FOLLOW_simple_expression_in_iteration_stmt371);
			simple_expression38=simple_expression();
			state._fsp--;

			stream_simple_expression.add(simple_expression38.getTree());
			char_literal39=(Token)match(input,31,FOLLOW_31_in_iteration_stmt372);  
			stream_31.add(char_literal39);

			pushFollow(FOLLOW_statement_in_iteration_stmt373);
			statement40=statement();
			state._fsp--;

			stream_statement.add(statement40.getTree());
			// AST REWRITE
			// elements: simple_expression, 51, 31, 30, statement
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 67:41: -> ^( WHILESTMT 'while' '(' simple_expression ')' statement )
			{
				// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:67:43: ^( WHILESTMT 'while' '(' simple_expression ')' statement )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(WHILESTMT, "WHILESTMT"), root_1);
				adaptor.addChild(root_1, stream_51.nextNode());
				adaptor.addChild(root_1, stream_30.nextNode());
				adaptor.addChild(root_1, stream_simple_expression.nextTree());
				adaptor.addChild(root_1, stream_31.nextNode());
				adaptor.addChild(root_1, stream_statement.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {

				throw re;

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "iteration_stmt"


	public static class return_stmt_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "return_stmt"
	// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:71:1: return_stmt : 'return' simple_expression ';' -> ^( RETURNSTMT 'return' simple_expression ';' ) ;
	public final BitLanguageParser.return_stmt_return return_stmt() throws RecognitionException {
		BitLanguageParser.return_stmt_return retval = new BitLanguageParser.return_stmt_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal41=null;
		Token char_literal43=null;
		ParserRuleReturnScope simple_expression42 =null;

		CommonTree string_literal41_tree=null;
		CommonTree char_literal43_tree=null;
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleSubtreeStream stream_simple_expression=new RewriteRuleSubtreeStream(adaptor,"rule simple_expression");

		try {
			// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:71:13: ( 'return' simple_expression ';' -> ^( RETURNSTMT 'return' simple_expression ';' ) )
			// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:72:1: 'return' simple_expression ';'
			{
			string_literal41=(Token)match(input,50,FOLLOW_50_in_return_stmt396);  
			stream_50.add(string_literal41);

			pushFollow(FOLLOW_simple_expression_in_return_stmt397);
			simple_expression42=simple_expression();
			state._fsp--;

			stream_simple_expression.add(simple_expression42.getTree());
			char_literal43=(Token)match(input,37,FOLLOW_37_in_return_stmt398);  
			stream_37.add(char_literal43);

			// AST REWRITE
			// elements: 50, simple_expression, 37
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 72:30: -> ^( RETURNSTMT 'return' simple_expression ';' )
			{
				// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:72:32: ^( RETURNSTMT 'return' simple_expression ';' )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RETURNSTMT, "RETURNSTMT"), root_1);
				adaptor.addChild(root_1, stream_50.nextNode());
				adaptor.addChild(root_1, stream_simple_expression.nextTree());
				adaptor.addChild(root_1, stream_37.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {

				throw re;

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "return_stmt"


	public static class expression_stmt_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expression_stmt"
	// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:76:1: expression_stmt : expression -> ^( EXPSTMT expression ) ;
	public final BitLanguageParser.expression_stmt_return expression_stmt() throws RecognitionException {
		BitLanguageParser.expression_stmt_return retval = new BitLanguageParser.expression_stmt_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope expression44 =null;

		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:76:17: ( expression -> ^( EXPSTMT expression ) )
			// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:77:1: expression
			{
			pushFollow(FOLLOW_expression_in_expression_stmt419);
			expression44=expression();
			state._fsp--;

			stream_expression.add(expression44.getTree());
			// AST REWRITE
			// elements: expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 77:12: -> ^( EXPSTMT expression )
			{
				// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:77:14: ^( EXPSTMT expression )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPSTMT, "EXPSTMT"), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {

				throw re;

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression_stmt"


	public static class expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:81:1: expression : var '=' simple_expression ';' -> ^( EXP var '=' simple_expression ';' ) ;
	public final BitLanguageParser.expression_return expression() throws RecognitionException {
		BitLanguageParser.expression_return retval = new BitLanguageParser.expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal46=null;
		Token char_literal48=null;
		ParserRuleReturnScope var45 =null;
		ParserRuleReturnScope simple_expression47 =null;

		CommonTree char_literal46_tree=null;
		CommonTree char_literal48_tree=null;
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleSubtreeStream stream_simple_expression=new RewriteRuleSubtreeStream(adaptor,"rule simple_expression");
		RewriteRuleSubtreeStream stream_var=new RewriteRuleSubtreeStream(adaptor,"rule var");

		try {
			// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:81:12: ( var '=' simple_expression ';' -> ^( EXP var '=' simple_expression ';' ) )
			// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:82:1: var '=' simple_expression ';'
			{
			pushFollow(FOLLOW_var_in_expression438);
			var45=var();
			state._fsp--;

			stream_var.add(var45.getTree());
			char_literal46=(Token)match(input,40,FOLLOW_40_in_expression439);  
			stream_40.add(char_literal46);

			pushFollow(FOLLOW_simple_expression_in_expression440);
			simple_expression47=simple_expression();
			state._fsp--;

			stream_simple_expression.add(simple_expression47.getTree());
			char_literal48=(Token)match(input,37,FOLLOW_37_in_expression441);  
			stream_37.add(char_literal48);

			// AST REWRITE
			// elements: 37, var, simple_expression, 40
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 82:29: -> ^( EXP var '=' simple_expression ';' )
			{
				// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:82:31: ^( EXP var '=' simple_expression ';' )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXP, "EXP"), root_1);
				adaptor.addChild(root_1, stream_var.nextTree());
				adaptor.addChild(root_1, stream_40.nextNode());
				adaptor.addChild(root_1, stream_simple_expression.nextTree());
				adaptor.addChild(root_1, stream_37.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {

				throw re;

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class var_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "var"
	// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:86:1: var : ID ( '[' additive_expression ']' )? -> ^( VAR ID ( '[' additive_expression ']' )? ) ;
	public final BitLanguageParser.var_return var() throws RecognitionException {
		BitLanguageParser.var_return retval = new BitLanguageParser.var_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ID49=null;
		Token char_literal50=null;
		Token char_literal52=null;
		ParserRuleReturnScope additive_expression51 =null;

		CommonTree ID49_tree=null;
		CommonTree char_literal50_tree=null;
		CommonTree char_literal52_tree=null;
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_additive_expression=new RewriteRuleSubtreeStream(adaptor,"rule additive_expression");

		try {
			// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:86:5: ( ID ( '[' additive_expression ']' )? -> ^( VAR ID ( '[' additive_expression ']' )? ) )
			// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:87:1: ID ( '[' additive_expression ']' )?
			{
			ID49=(Token)match(input,ID,FOLLOW_ID_in_var464);  
			stream_ID.add(ID49);

			// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:87:3: ( '[' additive_expression ']' )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==45) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:87:4: '[' additive_expression ']'
					{
					char_literal50=(Token)match(input,45,FOLLOW_45_in_var466);  
					stream_45.add(char_literal50);

					pushFollow(FOLLOW_additive_expression_in_var467);
					additive_expression51=additive_expression();
					state._fsp--;

					stream_additive_expression.add(additive_expression51.getTree());
					char_literal52=(Token)match(input,46,FOLLOW_46_in_var468);  
					stream_46.add(char_literal52);

					}
					break;

			}

			// AST REWRITE
			// elements: ID, 45, 46, additive_expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 87:32: -> ^( VAR ID ( '[' additive_expression ']' )? )
			{
				// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:87:34: ^( VAR ID ( '[' additive_expression ']' )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR, "VAR"), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
				// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:87:42: ( '[' additive_expression ']' )?
				if ( stream_45.hasNext()||stream_46.hasNext()||stream_additive_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_45.nextNode());
					adaptor.addChild(root_1, stream_additive_expression.nextTree());
					adaptor.addChild(root_1, stream_46.nextNode());
				}
				stream_45.reset();
				stream_46.reset();
				stream_additive_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {

				throw re;

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "var"


	public static class simple_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "simple_expression"
	// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:91:1: simple_expression : additive_expression ( relop additive_expression )? -> ^( SIMEXP additive_expression ( relop additive_expression )? ) ;
	public final BitLanguageParser.simple_expression_return simple_expression() throws RecognitionException {
		BitLanguageParser.simple_expression_return retval = new BitLanguageParser.simple_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope additive_expression53 =null;
		ParserRuleReturnScope relop54 =null;
		ParserRuleReturnScope additive_expression55 =null;

		RewriteRuleSubtreeStream stream_additive_expression=new RewriteRuleSubtreeStream(adaptor,"rule additive_expression");
		RewriteRuleSubtreeStream stream_relop=new RewriteRuleSubtreeStream(adaptor,"rule relop");

		try {
			// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:91:19: ( additive_expression ( relop additive_expression )? -> ^( SIMEXP additive_expression ( relop additive_expression )? ) )
			// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:92:1: additive_expression ( relop additive_expression )?
			{
			pushFollow(FOLLOW_additive_expression_in_simple_expression495);
			additive_expression53=additive_expression();
			state._fsp--;

			stream_additive_expression.add(additive_expression53.getTree());
			// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:92:21: ( relop additive_expression )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==27||LA10_0==29||(LA10_0 >= 38 && LA10_0 <= 39)||(LA10_0 >= 41 && LA10_0 <= 43)||LA10_0==53) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:92:22: relop additive_expression
					{
					pushFollow(FOLLOW_relop_in_simple_expression498);
					relop54=relop();
					state._fsp--;

					stream_relop.add(relop54.getTree());
					pushFollow(FOLLOW_additive_expression_in_simple_expression500);
					additive_expression55=additive_expression();
					state._fsp--;

					stream_additive_expression.add(additive_expression55.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: relop, additive_expression, additive_expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 92:50: -> ^( SIMEXP additive_expression ( relop additive_expression )? )
			{
				// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:92:52: ^( SIMEXP additive_expression ( relop additive_expression )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SIMEXP, "SIMEXP"), root_1);
				adaptor.addChild(root_1, stream_additive_expression.nextTree());
				// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:92:81: ( relop additive_expression )?
				if ( stream_relop.hasNext()||stream_additive_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_relop.nextTree());
					adaptor.addChild(root_1, stream_additive_expression.nextTree());
				}
				stream_relop.reset();
				stream_additive_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {

				throw re;

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "simple_expression"


	public static class relop_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "relop"
	// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:96:1: relop : ( '<' -> ^( RELOP '<' ) | '<=' -> ^( RELOP '<=' ) | '>' -> ^( RELOP '>' ) | '>=' -> ^( RELOP '>=' ) | '==' -> ^( RELOP '==' ) | '!=' -> ^( RELOP '!=' ) | '&&' -> ^( RELOP '&&' ) | '||' -> ^( RELOP '||' ) );
	public final BitLanguageParser.relop_return relop() throws RecognitionException {
		BitLanguageParser.relop_return retval = new BitLanguageParser.relop_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal56=null;
		Token string_literal57=null;
		Token char_literal58=null;
		Token string_literal59=null;
		Token string_literal60=null;
		Token string_literal61=null;
		Token string_literal62=null;
		Token string_literal63=null;

		CommonTree char_literal56_tree=null;
		CommonTree string_literal57_tree=null;
		CommonTree char_literal58_tree=null;
		CommonTree string_literal59_tree=null;
		CommonTree string_literal60_tree=null;
		CommonTree string_literal61_tree=null;
		CommonTree string_literal62_tree=null;
		CommonTree string_literal63_tree=null;
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");

		try {
			// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:96:7: ( '<' -> ^( RELOP '<' ) | '<=' -> ^( RELOP '<=' ) | '>' -> ^( RELOP '>' ) | '>=' -> ^( RELOP '>=' ) | '==' -> ^( RELOP '==' ) | '!=' -> ^( RELOP '!=' ) | '&&' -> ^( RELOP '&&' ) | '||' -> ^( RELOP '||' ) )
			int alt11=8;
			switch ( input.LA(1) ) {
			case 38:
				{
				alt11=1;
				}
				break;
			case 39:
				{
				alt11=2;
				}
				break;
			case 42:
				{
				alt11=3;
				}
				break;
			case 43:
				{
				alt11=4;
				}
				break;
			case 41:
				{
				alt11=5;
				}
				break;
			case 27:
				{
				alt11=6;
				}
				break;
			case 29:
				{
				alt11=7;
				}
				break;
			case 53:
				{
				alt11=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:97:1: '<'
					{
					char_literal56=(Token)match(input,38,FOLLOW_38_in_relop528);  
					stream_38.add(char_literal56);

					// AST REWRITE
					// elements: 38
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 97:5: -> ^( RELOP '<' )
					{
						// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:97:7: ^( RELOP '<' )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RELOP, "RELOP"), root_1);
						adaptor.addChild(root_1, stream_38.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:98:3: '<='
					{
					string_literal57=(Token)match(input,39,FOLLOW_39_in_relop539);  
					stream_39.add(string_literal57);

					// AST REWRITE
					// elements: 39
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 98:8: -> ^( RELOP '<=' )
					{
						// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:98:10: ^( RELOP '<=' )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RELOP, "RELOP"), root_1);
						adaptor.addChild(root_1, stream_39.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:99:3: '>'
					{
					char_literal58=(Token)match(input,42,FOLLOW_42_in_relop550);  
					stream_42.add(char_literal58);

					// AST REWRITE
					// elements: 42
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 99:7: -> ^( RELOP '>' )
					{
						// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:99:9: ^( RELOP '>' )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RELOP, "RELOP"), root_1);
						adaptor.addChild(root_1, stream_42.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:100:3: '>='
					{
					string_literal59=(Token)match(input,43,FOLLOW_43_in_relop561);  
					stream_43.add(string_literal59);

					// AST REWRITE
					// elements: 43
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 100:8: -> ^( RELOP '>=' )
					{
						// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:100:10: ^( RELOP '>=' )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RELOP, "RELOP"), root_1);
						adaptor.addChild(root_1, stream_43.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:101:3: '=='
					{
					string_literal60=(Token)match(input,41,FOLLOW_41_in_relop572);  
					stream_41.add(string_literal60);

					// AST REWRITE
					// elements: 41
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 101:8: -> ^( RELOP '==' )
					{
						// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:101:10: ^( RELOP '==' )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RELOP, "RELOP"), root_1);
						adaptor.addChild(root_1, stream_41.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:102:3: '!='
					{
					string_literal61=(Token)match(input,27,FOLLOW_27_in_relop583);  
					stream_27.add(string_literal61);

					// AST REWRITE
					// elements: 27
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 102:8: -> ^( RELOP '!=' )
					{
						// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:102:10: ^( RELOP '!=' )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RELOP, "RELOP"), root_1);
						adaptor.addChild(root_1, stream_27.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 7 :
					// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:103:3: '&&'
					{
					string_literal62=(Token)match(input,29,FOLLOW_29_in_relop594);  
					stream_29.add(string_literal62);

					// AST REWRITE
					// elements: 29
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 103:8: -> ^( RELOP '&&' )
					{
						// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:103:10: ^( RELOP '&&' )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RELOP, "RELOP"), root_1);
						adaptor.addChild(root_1, stream_29.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 8 :
					// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:104:3: '||'
					{
					string_literal63=(Token)match(input,53,FOLLOW_53_in_relop605);  
					stream_53.add(string_literal63);

					// AST REWRITE
					// elements: 53
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 104:8: -> ^( RELOP '||' )
					{
						// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:104:10: ^( RELOP '||' )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RELOP, "RELOP"), root_1);
						adaptor.addChild(root_1, stream_53.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {

				throw re;

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "relop"


	public static class additive_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "additive_expression"
	// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:108:1: additive_expression : term ( addop term )* -> ^( ADDEXP term ( addop term )* ) ;
	public final BitLanguageParser.additive_expression_return additive_expression() throws RecognitionException {
		BitLanguageParser.additive_expression_return retval = new BitLanguageParser.additive_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope term64 =null;
		ParserRuleReturnScope addop65 =null;
		ParserRuleReturnScope term66 =null;

		RewriteRuleSubtreeStream stream_addop=new RewriteRuleSubtreeStream(adaptor,"rule addop");
		RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");

		try {
			// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:108:21: ( term ( addop term )* -> ^( ADDEXP term ( addop term )* ) )
			// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:109:1: term ( addop term )*
			{
			pushFollow(FOLLOW_term_in_additive_expression624);
			term64=term();
			state._fsp--;

			stream_term.add(term64.getTree());
			// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:109:6: ( addop term )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==33||LA12_0==35) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:109:7: addop term
					{
					pushFollow(FOLLOW_addop_in_additive_expression627);
					addop65=addop();
					state._fsp--;

					stream_addop.add(addop65.getTree());
					pushFollow(FOLLOW_term_in_additive_expression629);
					term66=term();
					state._fsp--;

					stream_term.add(term66.getTree());
					}
					break;

				default :
					break loop12;
				}
			}

			// AST REWRITE
			// elements: term, term, addop
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 109:20: -> ^( ADDEXP term ( addop term )* )
			{
				// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:109:22: ^( ADDEXP term ( addop term )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ADDEXP, "ADDEXP"), root_1);
				adaptor.addChild(root_1, stream_term.nextTree());
				// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:109:36: ( addop term )*
				while ( stream_term.hasNext()||stream_addop.hasNext() ) {
					adaptor.addChild(root_1, stream_addop.nextTree());
					adaptor.addChild(root_1, stream_term.nextTree());
				}
				stream_term.reset();
				stream_addop.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {

				throw re;

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "additive_expression"


	public static class addop_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "addop"
	// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:113:1: addop : ( '+' -> ^( ADDOP '+' ) | '-' -> ^( ADDOP '-' ) );
	public final BitLanguageParser.addop_return addop() throws RecognitionException {
		BitLanguageParser.addop_return retval = new BitLanguageParser.addop_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal67=null;
		Token char_literal68=null;

		CommonTree char_literal67_tree=null;
		CommonTree char_literal68_tree=null;
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");

		try {
			// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:113:7: ( '+' -> ^( ADDOP '+' ) | '-' -> ^( ADDOP '-' ) )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==33) ) {
				alt13=1;
			}
			else if ( (LA13_0==35) ) {
				alt13=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:114:1: '+'
					{
					char_literal67=(Token)match(input,33,FOLLOW_33_in_addop657);  
					stream_33.add(char_literal67);

					// AST REWRITE
					// elements: 33
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 114:5: -> ^( ADDOP '+' )
					{
						// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:114:7: ^( ADDOP '+' )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ADDOP, "ADDOP"), root_1);
						adaptor.addChild(root_1, stream_33.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:115:3: '-'
					{
					char_literal68=(Token)match(input,35,FOLLOW_35_in_addop668);  
					stream_35.add(char_literal68);

					// AST REWRITE
					// elements: 35
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 115:7: -> ^( ADDOP '-' )
					{
						// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:115:9: ^( ADDOP '-' )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ADDOP, "ADDOP"), root_1);
						adaptor.addChild(root_1, stream_35.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {

				throw re;

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "addop"


	public static class term_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "term"
	// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:119:1: term : factor ( mulop factor )* -> ^( TERM factor ( mulop factor )* ) ;
	public final BitLanguageParser.term_return term() throws RecognitionException {
		BitLanguageParser.term_return retval = new BitLanguageParser.term_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope factor69 =null;
		ParserRuleReturnScope mulop70 =null;
		ParserRuleReturnScope factor71 =null;

		RewriteRuleSubtreeStream stream_factor=new RewriteRuleSubtreeStream(adaptor,"rule factor");
		RewriteRuleSubtreeStream stream_mulop=new RewriteRuleSubtreeStream(adaptor,"rule mulop");

		try {
			// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:119:6: ( factor ( mulop factor )* -> ^( TERM factor ( mulop factor )* ) )
			// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:120:1: factor ( mulop factor )*
			{
			pushFollow(FOLLOW_factor_in_term687);
			factor69=factor();
			state._fsp--;

			stream_factor.add(factor69.getTree());
			// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:120:7: ( mulop factor )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==28||LA14_0==32||LA14_0==36) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:120:8: mulop factor
					{
					pushFollow(FOLLOW_mulop_in_term689);
					mulop70=mulop();
					state._fsp--;

					stream_mulop.add(mulop70.getTree());
					pushFollow(FOLLOW_factor_in_term691);
					factor71=factor();
					state._fsp--;

					stream_factor.add(factor71.getTree());
					}
					break;

				default :
					break loop14;
				}
			}

			// AST REWRITE
			// elements: factor, factor, mulop
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 120:23: -> ^( TERM factor ( mulop factor )* )
			{
				// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:120:25: ^( TERM factor ( mulop factor )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TERM, "TERM"), root_1);
				adaptor.addChild(root_1, stream_factor.nextTree());
				// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:120:38: ( mulop factor )*
				while ( stream_factor.hasNext()||stream_mulop.hasNext() ) {
					adaptor.addChild(root_1, stream_mulop.nextTree());
					adaptor.addChild(root_1, stream_factor.nextTree());
				}
				stream_factor.reset();
				stream_mulop.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {

				throw re;

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "term"


	public static class mulop_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "mulop"
	// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:124:1: mulop : ( '*' -> ^( MULOP '*' ) | '/' -> ^( MULOP '/' ) | '%' -> ^( MULOP '%' ) );
	public final BitLanguageParser.mulop_return mulop() throws RecognitionException {
		BitLanguageParser.mulop_return retval = new BitLanguageParser.mulop_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal72=null;
		Token char_literal73=null;
		Token char_literal74=null;

		CommonTree char_literal72_tree=null;
		CommonTree char_literal73_tree=null;
		CommonTree char_literal74_tree=null;
		RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");

		try {
			// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:124:7: ( '*' -> ^( MULOP '*' ) | '/' -> ^( MULOP '/' ) | '%' -> ^( MULOP '%' ) )
			int alt15=3;
			switch ( input.LA(1) ) {
			case 32:
				{
				alt15=1;
				}
				break;
			case 36:
				{
				alt15=2;
				}
				break;
			case 28:
				{
				alt15=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}
			switch (alt15) {
				case 1 :
					// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:125:1: '*'
					{
					char_literal72=(Token)match(input,32,FOLLOW_32_in_mulop718);  
					stream_32.add(char_literal72);

					// AST REWRITE
					// elements: 32
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 125:5: -> ^( MULOP '*' )
					{
						// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:125:7: ^( MULOP '*' )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MULOP, "MULOP"), root_1);
						adaptor.addChild(root_1, stream_32.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:126:3: '/'
					{
					char_literal73=(Token)match(input,36,FOLLOW_36_in_mulop729);  
					stream_36.add(char_literal73);

					// AST REWRITE
					// elements: 36
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 126:7: -> ^( MULOP '/' )
					{
						// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:126:9: ^( MULOP '/' )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MULOP, "MULOP"), root_1);
						adaptor.addChild(root_1, stream_36.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:127:3: '%'
					{
					char_literal74=(Token)match(input,28,FOLLOW_28_in_mulop740);  
					stream_28.add(char_literal74);

					// AST REWRITE
					// elements: 28
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 127:6: -> ^( MULOP '%' )
					{
						// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:127:8: ^( MULOP '%' )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MULOP, "MULOP"), root_1);
						adaptor.addChild(root_1, stream_28.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {

				throw re;

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "mulop"


	public static class factor_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "factor"
	// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:131:1: factor : ( '(' simple_expression ')' -> ^( FACTOR '(' simple_expression ')' ) | var -> ^( FACTOR var ) | 'RANDOM' '(' simple_expression ')' -> ^( FACTOR 'RANDOM' '(' simple_expression ')' ) | NUM -> ^( FACTOR NUM ) );
	public final BitLanguageParser.factor_return factor() throws RecognitionException {
		BitLanguageParser.factor_return retval = new BitLanguageParser.factor_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal75=null;
		Token char_literal77=null;
		Token string_literal79=null;
		Token char_literal80=null;
		Token char_literal82=null;
		Token NUM83=null;
		ParserRuleReturnScope simple_expression76 =null;
		ParserRuleReturnScope var78 =null;
		ParserRuleReturnScope simple_expression81 =null;

		CommonTree char_literal75_tree=null;
		CommonTree char_literal77_tree=null;
		CommonTree string_literal79_tree=null;
		CommonTree char_literal80_tree=null;
		CommonTree char_literal82_tree=null;
		CommonTree NUM83_tree=null;
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
		RewriteRuleTokenStream stream_NUM=new RewriteRuleTokenStream(adaptor,"token NUM");
		RewriteRuleSubtreeStream stream_simple_expression=new RewriteRuleSubtreeStream(adaptor,"rule simple_expression");
		RewriteRuleSubtreeStream stream_var=new RewriteRuleSubtreeStream(adaptor,"rule var");

		try {
			// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:131:8: ( '(' simple_expression ')' -> ^( FACTOR '(' simple_expression ')' ) | var -> ^( FACTOR var ) | 'RANDOM' '(' simple_expression ')' -> ^( FACTOR 'RANDOM' '(' simple_expression ')' ) | NUM -> ^( FACTOR NUM ) )
			int alt16=4;
			switch ( input.LA(1) ) {
			case 30:
				{
				alt16=1;
				}
				break;
			case ID:
				{
				alt16=2;
				}
				break;
			case 44:
				{
				alt16=3;
				}
				break;
			case NUM:
				{
				alt16=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:132:1: '(' simple_expression ')'
					{
					char_literal75=(Token)match(input,30,FOLLOW_30_in_factor758);  
					stream_30.add(char_literal75);

					pushFollow(FOLLOW_simple_expression_in_factor759);
					simple_expression76=simple_expression();
					state._fsp--;

					stream_simple_expression.add(simple_expression76.getTree());
					char_literal77=(Token)match(input,31,FOLLOW_31_in_factor760);  
					stream_31.add(char_literal77);

					// AST REWRITE
					// elements: simple_expression, 30, 31
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 132:25: -> ^( FACTOR '(' simple_expression ')' )
					{
						// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:132:27: ^( FACTOR '(' simple_expression ')' )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FACTOR, "FACTOR"), root_1);
						adaptor.addChild(root_1, stream_30.nextNode());
						adaptor.addChild(root_1, stream_simple_expression.nextTree());
						adaptor.addChild(root_1, stream_31.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:133:3: var
					{
					pushFollow(FOLLOW_var_in_factor773);
					var78=var();
					state._fsp--;

					stream_var.add(var78.getTree());
					// AST REWRITE
					// elements: var
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 133:7: -> ^( FACTOR var )
					{
						// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:133:9: ^( FACTOR var )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FACTOR, "FACTOR"), root_1);
						adaptor.addChild(root_1, stream_var.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:134:3: 'RANDOM' '(' simple_expression ')'
					{
					string_literal79=(Token)match(input,44,FOLLOW_44_in_factor784);  
					stream_44.add(string_literal79);

					char_literal80=(Token)match(input,30,FOLLOW_30_in_factor785);  
					stream_30.add(char_literal80);

					pushFollow(FOLLOW_simple_expression_in_factor786);
					simple_expression81=simple_expression();
					state._fsp--;

					stream_simple_expression.add(simple_expression81.getTree());
					char_literal82=(Token)match(input,31,FOLLOW_31_in_factor787);  
					stream_31.add(char_literal82);

					// AST REWRITE
					// elements: 31, 30, 44, simple_expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 134:35: -> ^( FACTOR 'RANDOM' '(' simple_expression ')' )
					{
						// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:134:37: ^( FACTOR 'RANDOM' '(' simple_expression ')' )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FACTOR, "FACTOR"), root_1);
						adaptor.addChild(root_1, stream_44.nextNode());
						adaptor.addChild(root_1, stream_30.nextNode());
						adaptor.addChild(root_1, stream_simple_expression.nextTree());
						adaptor.addChild(root_1, stream_31.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:135:3: NUM
					{
					NUM83=(Token)match(input,NUM,FOLLOW_NUM_in_factor801);  
					stream_NUM.add(NUM83);

					// AST REWRITE
					// elements: NUM
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 135:7: -> ^( FACTOR NUM )
					{
						// E:\\资料\\学习资料\\大三\\编译原理项目\\antlr\\BitLanguage.g:135:9: ^( FACTOR NUM )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FACTOR, "FACTOR"), root_1);
						adaptor.addChild(root_1, stream_NUM.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {

				throw re;

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "factor"

	// Delegated rules



	public static final BitSet FOLLOW_statement_list_in_program95 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statement_list114 = new BitSet(new long[]{0x001F000000001002L});
	public static final BitSet FOLLOW_declaration_stmt_in_statement135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_stmt_in_statement146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compound_stmt_in_statement157 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_stmt_in_statement168 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_iteration_stmt_in_statement179 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_return_stmt_in_statement190 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_declaration_stmt208 = new BitSet(new long[]{0x0002000000000002L});
	public static final BitSet FOLLOW_49_in_declaration230 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ID_in_declaration231 = new BitSet(new long[]{0x0000012000000000L});
	public static final BitSet FOLLOW_40_in_declaration233 = new BitSet(new long[]{0x0000100040009000L});
	public static final BitSet FOLLOW_additive_expression_in_declaration234 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_declaration237 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_declaration257 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ID_in_declaration258 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_declaration259 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_NUM_in_declaration260 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_declaration261 = new BitSet(new long[]{0x0000012000000000L});
	public static final BitSet FOLLOW_40_in_declaration263 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_declaration264 = new BitSet(new long[]{0x0040100040009000L});
	public static final BitSet FOLLOW_additive_expression_in_declaration266 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_declaration267 = new BitSet(new long[]{0x0040100040009000L});
	public static final BitSet FOLLOW_54_in_declaration270 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_declaration273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_compound_stmt309 = new BitSet(new long[]{0x001F000000001000L});
	public static final BitSet FOLLOW_statement_list_in_compound_stmt310 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_compound_stmt311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_if_stmt332 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_if_stmt333 = new BitSet(new long[]{0x0000100040009000L});
	public static final BitSet FOLLOW_simple_expression_in_if_stmt334 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_if_stmt335 = new BitSet(new long[]{0x001F000000001000L});
	public static final BitSet FOLLOW_statement_in_if_stmt336 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_47_in_if_stmt338 = new BitSet(new long[]{0x001F000000001000L});
	public static final BitSet FOLLOW_statement_in_if_stmt339 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_iteration_stmt369 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_iteration_stmt370 = new BitSet(new long[]{0x0000100040009000L});
	public static final BitSet FOLLOW_simple_expression_in_iteration_stmt371 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_iteration_stmt372 = new BitSet(new long[]{0x001F000000001000L});
	public static final BitSet FOLLOW_statement_in_iteration_stmt373 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_return_stmt396 = new BitSet(new long[]{0x0000100040009000L});
	public static final BitSet FOLLOW_simple_expression_in_return_stmt397 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_return_stmt398 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expression_stmt419 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_var_in_expression438 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_expression439 = new BitSet(new long[]{0x0000100040009000L});
	public static final BitSet FOLLOW_simple_expression_in_expression440 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_expression441 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_var464 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_45_in_var466 = new BitSet(new long[]{0x0000100040009000L});
	public static final BitSet FOLLOW_additive_expression_in_var467 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_var468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_additive_expression_in_simple_expression495 = new BitSet(new long[]{0x00200EC028000002L});
	public static final BitSet FOLLOW_relop_in_simple_expression498 = new BitSet(new long[]{0x0000100040009000L});
	public static final BitSet FOLLOW_additive_expression_in_simple_expression500 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_relop528 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_relop539 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_relop550 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_relop561 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_relop572 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_relop583 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_relop594 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_relop605 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_additive_expression624 = new BitSet(new long[]{0x0000000A00000002L});
	public static final BitSet FOLLOW_addop_in_additive_expression627 = new BitSet(new long[]{0x0000100040009000L});
	public static final BitSet FOLLOW_term_in_additive_expression629 = new BitSet(new long[]{0x0000000A00000002L});
	public static final BitSet FOLLOW_33_in_addop657 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_addop668 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_factor_in_term687 = new BitSet(new long[]{0x0000001110000002L});
	public static final BitSet FOLLOW_mulop_in_term689 = new BitSet(new long[]{0x0000100040009000L});
	public static final BitSet FOLLOW_factor_in_term691 = new BitSet(new long[]{0x0000001110000002L});
	public static final BitSet FOLLOW_32_in_mulop718 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_mulop729 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_mulop740 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_factor758 = new BitSet(new long[]{0x0000100040009000L});
	public static final BitSet FOLLOW_simple_expression_in_factor759 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_factor760 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_var_in_factor773 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_factor784 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_factor785 = new BitSet(new long[]{0x0000100040009000L});
	public static final BitSet FOLLOW_simple_expression_in_factor786 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_factor787 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUM_in_factor801 = new BitSet(new long[]{0x0000000000000002L});
}
