// $ANTLR 3.5.2 E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g 2015-08-21 16:59:45

	package bitwars;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class BitLanguageLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public BitLanguageLexer() {} 
	public BitLanguageLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public BitLanguageLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g"; }

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:6:7: ( '!=' )
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:6:9: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:7:7: ( '%' )
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:7:9: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:8:7: ( '&&' )
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:8:9: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:9:7: ( '(' )
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:9:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:10:7: ( ')' )
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:10:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:11:7: ( '*' )
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:11:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:12:7: ( '+' )
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:12:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:13:7: ( ',' )
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:13:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:14:7: ( '-' )
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:14:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:15:7: ( '/' )
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:15:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:16:7: ( ';' )
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:16:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:17:7: ( '<' )
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:17:9: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:18:7: ( '<=' )
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:18:9: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:19:7: ( '=' )
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:19:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:20:7: ( '==' )
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:20:9: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:21:7: ( '>' )
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:21:9: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:22:7: ( '>=' )
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:22:9: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:23:7: ( 'RANDOM' )
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:23:9: 'RANDOM'
			{
			match("RANDOM"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:24:7: ( '[' )
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:24:9: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:25:7: ( ']' )
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:25:9: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:26:7: ( 'else' )
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:26:9: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__47"

	// $ANTLR start "T__48"
	public final void mT__48() throws RecognitionException {
		try {
			int _type = T__48;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:27:7: ( 'if' )
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:27:9: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__48"

	// $ANTLR start "T__49"
	public final void mT__49() throws RecognitionException {
		try {
			int _type = T__49;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:28:7: ( 'int' )
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:28:9: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__49"

	// $ANTLR start "T__50"
	public final void mT__50() throws RecognitionException {
		try {
			int _type = T__50;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:29:7: ( 'return' )
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:29:9: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__50"

	// $ANTLR start "T__51"
	public final void mT__51() throws RecognitionException {
		try {
			int _type = T__51;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:30:7: ( 'while' )
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:30:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__51"

	// $ANTLR start "T__52"
	public final void mT__52() throws RecognitionException {
		try {
			int _type = T__52;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:31:7: ( '{' )
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:31:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__52"

	// $ANTLR start "T__53"
	public final void mT__53() throws RecognitionException {
		try {
			int _type = T__53;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:32:7: ( '||' )
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:32:9: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__53"

	// $ANTLR start "T__54"
	public final void mT__54() throws RecognitionException {
		try {
			int _type = T__54;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:33:7: ( '}' )
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:33:9: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__54"

	// $ANTLR start "REWORD"
	public final void mREWORD() throws RecognitionException {
		try {
			int _type = REWORD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:141:8: ( ( 'if' | 'else' | 'where' | 'return' | 'int' ) )
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:141:10: ( 'if' | 'else' | 'where' | 'return' | 'int' )
			{
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:141:10: ( 'if' | 'else' | 'where' | 'return' | 'int' )
			int alt1=5;
			switch ( input.LA(1) ) {
			case 'i':
				{
				int LA1_1 = input.LA(2);
				if ( (LA1_1=='f') ) {
					alt1=1;
				}
				else if ( (LA1_1=='n') ) {
					alt1=5;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'e':
				{
				alt1=2;
				}
				break;
			case 'w':
				{
				alt1=3;
				}
				break;
			case 'r':
				{
				alt1=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:141:11: 'if'
					{
					match("if"); 

					}
					break;
				case 2 :
					// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:141:18: 'else'
					{
					match("else"); 

					}
					break;
				case 3 :
					// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:141:27: 'where'
					{
					match("where"); 

					}
					break;
				case 4 :
					// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:141:37: 'return'
					{
					match("return"); 

					}
					break;
				case 5 :
					// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:141:48: 'int'
					{
					match("int"); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REWORD"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:142:4: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ )
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:142:6: ( 'a' .. 'z' | 'A' .. 'Z' )+
			{
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:142:6: ( 'a' .. 'z' | 'A' .. 'Z' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= 'A' && LA2_0 <= 'Z')||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:
					{
					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "NUM"
	public final void mNUM() throws RecognitionException {
		try {
			int _type = NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:143:5: ( ( '0' .. '9' )+ )
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:143:7: ( '0' .. '9' )+
			{
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:143:7: ( '0' .. '9' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUM"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:144:4: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:144:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
			{
			// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:144:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '\t' && LA4_0 <= '\n')||LA4_0=='\r'||LA4_0==' ') ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:1:8: ( T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | REWORD | ID | NUM | WS )
		int alt5=32;
		alt5 = dfa5.predict(input);
		switch (alt5) {
			case 1 :
				// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:1:10: T__27
				{
				mT__27(); 

				}
				break;
			case 2 :
				// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:1:16: T__28
				{
				mT__28(); 

				}
				break;
			case 3 :
				// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:1:22: T__29
				{
				mT__29(); 

				}
				break;
			case 4 :
				// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:1:28: T__30
				{
				mT__30(); 

				}
				break;
			case 5 :
				// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:1:34: T__31
				{
				mT__31(); 

				}
				break;
			case 6 :
				// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:1:40: T__32
				{
				mT__32(); 

				}
				break;
			case 7 :
				// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:1:46: T__33
				{
				mT__33(); 

				}
				break;
			case 8 :
				// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:1:52: T__34
				{
				mT__34(); 

				}
				break;
			case 9 :
				// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:1:58: T__35
				{
				mT__35(); 

				}
				break;
			case 10 :
				// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:1:64: T__36
				{
				mT__36(); 

				}
				break;
			case 11 :
				// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:1:70: T__37
				{
				mT__37(); 

				}
				break;
			case 12 :
				// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:1:76: T__38
				{
				mT__38(); 

				}
				break;
			case 13 :
				// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:1:82: T__39
				{
				mT__39(); 

				}
				break;
			case 14 :
				// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:1:88: T__40
				{
				mT__40(); 

				}
				break;
			case 15 :
				// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:1:94: T__41
				{
				mT__41(); 

				}
				break;
			case 16 :
				// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:1:100: T__42
				{
				mT__42(); 

				}
				break;
			case 17 :
				// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:1:106: T__43
				{
				mT__43(); 

				}
				break;
			case 18 :
				// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:1:112: T__44
				{
				mT__44(); 

				}
				break;
			case 19 :
				// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:1:118: T__45
				{
				mT__45(); 

				}
				break;
			case 20 :
				// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:1:124: T__46
				{
				mT__46(); 

				}
				break;
			case 21 :
				// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:1:130: T__47
				{
				mT__47(); 

				}
				break;
			case 22 :
				// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:1:136: T__48
				{
				mT__48(); 

				}
				break;
			case 23 :
				// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:1:142: T__49
				{
				mT__49(); 

				}
				break;
			case 24 :
				// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:1:148: T__50
				{
				mT__50(); 

				}
				break;
			case 25 :
				// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:1:154: T__51
				{
				mT__51(); 

				}
				break;
			case 26 :
				// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:1:160: T__52
				{
				mT__52(); 

				}
				break;
			case 27 :
				// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:1:166: T__53
				{
				mT__53(); 

				}
				break;
			case 28 :
				// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:1:172: T__54
				{
				mT__54(); 

				}
				break;
			case 29 :
				// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:1:178: REWORD
				{
				mREWORD(); 

				}
				break;
			case 30 :
				// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:1:185: ID
				{
				mID(); 

				}
				break;
			case 31 :
				// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:1:188: NUM
				{
				mNUM(); 

				}
				break;
			case 32 :
				// E:\\����\\ѧϰ����\\����\\����ԭ����Ŀ\\antlr\\BitLanguage.g:1:192: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA5 dfa5 = new DFA5(this);
	static final String DFA5_eotS =
		"\14\uffff\1\35\1\37\1\41\1\31\2\uffff\4\31\14\uffff\2\31\1\52\5\31\1\uffff"+
		"\1\61\4\31\1\66\1\uffff\4\31\1\uffff\1\31\1\74\1\75\1\76\1\77\4\uffff";
	static final String DFA5_eofS =
		"\100\uffff";
	static final String DFA5_minS =
		"\1\11\13\uffff\3\75\1\101\2\uffff\1\154\1\146\1\145\1\150\14\uffff\1\116"+
		"\1\163\1\101\2\164\1\145\1\104\1\145\1\uffff\1\101\1\165\1\154\1\162\1"+
		"\117\1\101\1\uffff\1\162\2\145\1\115\1\uffff\1\156\4\101\4\uffff";
	static final String DFA5_maxS =
		"\1\175\13\uffff\3\75\1\101\2\uffff\1\154\1\156\1\145\1\150\14\uffff\1"+
		"\116\1\163\1\172\2\164\1\151\1\104\1\145\1\uffff\1\172\1\165\1\154\1\162"+
		"\1\117\1\172\1\uffff\1\162\2\145\1\115\1\uffff\1\156\4\172\4\uffff";
	static final String DFA5_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\4\uffff\1\23"+
		"\1\24\4\uffff\1\32\1\33\1\34\1\36\1\37\1\40\1\15\1\14\1\17\1\16\1\21\1"+
		"\20\10\uffff\1\26\6\uffff\1\27\4\uffff\1\25\5\uffff\1\31\1\35\1\22\1\30";
	static final String DFA5_specialS =
		"\100\uffff}>";
	static final String[] DFA5_transitionS = {
			"\2\33\2\uffff\1\33\22\uffff\1\33\1\1\3\uffff\1\2\1\3\1\uffff\1\4\1\5"+
			"\1\6\1\7\1\10\1\11\1\uffff\1\12\12\32\1\uffff\1\13\1\14\1\15\1\16\2\uffff"+
			"\21\31\1\17\10\31\1\20\1\uffff\1\21\3\uffff\4\31\1\22\3\31\1\23\10\31"+
			"\1\24\4\31\1\25\3\31\1\26\1\27\1\30",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\34",
			"\1\36",
			"\1\40",
			"\1\42",
			"",
			"",
			"\1\43",
			"\1\44\7\uffff\1\45",
			"\1\46",
			"\1\47",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\50",
			"\1\51",
			"\32\31\6\uffff\32\31",
			"\1\53",
			"\1\54",
			"\1\56\3\uffff\1\55",
			"\1\57",
			"\1\60",
			"",
			"\32\31\6\uffff\32\31",
			"\1\62",
			"\1\63",
			"\1\64",
			"\1\65",
			"\32\31\6\uffff\32\31",
			"",
			"\1\67",
			"\1\70",
			"\1\71",
			"\1\72",
			"",
			"\1\73",
			"\32\31\6\uffff\32\31",
			"\32\31\6\uffff\32\31",
			"\32\31\6\uffff\32\31",
			"\32\31\6\uffff\32\31",
			"",
			"",
			"",
			""
	};

	static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
	static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
	static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
	static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
	static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
	static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
	static final short[][] DFA5_transition;

	static {
		int numStates = DFA5_transitionS.length;
		DFA5_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
		}
	}

	protected class DFA5 extends DFA {

		public DFA5(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 5;
			this.eot = DFA5_eot;
			this.eof = DFA5_eof;
			this.min = DFA5_min;
			this.max = DFA5_max;
			this.accept = DFA5_accept;
			this.special = DFA5_special;
			this.transition = DFA5_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | REWORD | ID | NUM | WS );";
		}
	}

}
