package fr.mleduc.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCsvLexer extends Lexer {
    public static final int RULE_ID=7;
    public static final int RULE_WS=11;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_INT=8;
    public static final int RULE_ML_COMMENT=9;
    public static final int RULE_FREE_CELL=6;
    public static final int T__13=13;
    public static final int RULE_NL=4;
    public static final int EOF=-1;

    // delegates
    // delegators

    public InternalCsvLexer() {;} 
    public InternalCsvLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalCsvLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalCsv.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCsv.g:11:7: ( ',' )
            // InternalCsv.g:11:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "RULE_NL"
    public final void mRULE_NL() throws RecognitionException {
        try {
            int _type = RULE_NL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCsv.g:263:9: ( ( '\\r' | '\\n' )+ )
            // InternalCsv.g:263:11: ( '\\r' | '\\n' )+
            {
            // InternalCsv.g:263:11: ( '\\r' | '\\n' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\n'||LA1_0=='\r') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCsv.g:
            	    {
            	    if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NL"

    // $ANTLR start "RULE_FREE_CELL"
    public final void mRULE_FREE_CELL() throws RecognitionException {
        try {
            int _type = RULE_FREE_CELL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCsv.g:265:16: ( (~ ( ( '\\r' | '\\n' | ',' ) ) )* )
            // InternalCsv.g:265:18: (~ ( ( '\\r' | '\\n' | ',' ) ) )*
            {
            // InternalCsv.g:265:18: (~ ( ( '\\r' | '\\n' | ',' ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\f')||(LA2_0>='\u000E' && LA2_0<='+')||(LA2_0>='-' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCsv.g:265:18: ~ ( ( '\\r' | '\\n' | ',' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='+')||(input.LA(1)>='-' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FREE_CELL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCsv.g:267:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalCsv.g:267:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalCsv.g:267:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalCsv.g:267:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalCsv.g:267:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCsv.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCsv.g:269:10: ( ( '0' .. '9' )+ )
            // InternalCsv.g:269:12: ( '0' .. '9' )+
            {
            // InternalCsv.g:269:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalCsv.g:269:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCsv.g:271:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalCsv.g:271:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalCsv.g:271:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalCsv.g:271:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalCsv.g:271:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalCsv.g:271:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalCsv.g:271:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalCsv.g:271:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalCsv.g:271:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalCsv.g:271:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalCsv.g:271:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCsv.g:273:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalCsv.g:273:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalCsv.g:273:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCsv.g:273:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCsv.g:275:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalCsv.g:275:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalCsv.g:275:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCsv.g:275:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalCsv.g:275:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCsv.g:275:41: ( '\\r' )? '\\n'
                    {
                    // InternalCsv.g:275:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalCsv.g:275:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCsv.g:277:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalCsv.g:277:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalCsv.g:277:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalCsv.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCsv.g:279:16: ( . )
            // InternalCsv.g:279:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalCsv.g:1:8: ( T__13 | RULE_NL | RULE_FREE_CELL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=10;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalCsv.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalCsv.g:1:16: RULE_NL
                {
                mRULE_NL(); 

                }
                break;
            case 3 :
                // InternalCsv.g:1:24: RULE_FREE_CELL
                {
                mRULE_FREE_CELL(); 

                }
                break;
            case 4 :
                // InternalCsv.g:1:39: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 5 :
                // InternalCsv.g:1:47: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 6 :
                // InternalCsv.g:1:56: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 7 :
                // InternalCsv.g:1:68: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 8 :
                // InternalCsv.g:1:84: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 9 :
                // InternalCsv.g:1:100: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 10 :
                // InternalCsv.g:1:108: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\4\1\uffff\1\15\1\4\1\uffff\6\4\3\uffff\1\15\1\uffff\5\4\2\uffff\2\4\1\uffff\6\4\1\uffff\2\4\1\uffff\1\4";
    static final String DFA14_eofS =
        "\45\uffff";
    static final String DFA14_minS =
        "\1\0\1\uffff\1\11\1\101\1\uffff\2\60\2\0\1\52\1\11\3\uffff\1\11\1\uffff\3\60\2\0\2\uffff\2\0\1\uffff\2\0\1\11\3\0\1\uffff\2\0\1\uffff\1\0";
    static final String DFA14_maxS =
        "\1\uffff\1\uffff\1\40\1\172\1\uffff\1\172\1\71\2\uffff\1\57\1\40\3\uffff\1\40\1\uffff\2\172\1\71\2\uffff\2\uffff\2\uffff\1\uffff\2\uffff\1\40\3\uffff\1\uffff\2\uffff\1\uffff\1\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\2\uffff\1\3\6\uffff\1\3\1\1\1\2\1\uffff\1\11\5\uffff\1\3\1\6\2\uffff\1\3\6\uffff\1\7\2\uffff\1\10\1\uffff";
    static final String DFA14_specialS =
        "\1\11\6\uffff\1\3\1\12\12\uffff\1\5\1\15\2\uffff\1\10\1\1\1\uffff\1\4\1\2\1\uffff\1\14\1\0\1\6\1\uffff\1\7\1\16\1\uffff\1\13}>";
    static final String[] DFA14_transitionS = {
            "\11\13\1\12\1\2\2\13\1\2\22\13\1\12\1\13\1\7\4\13\1\10\4\13\1\1\2\13\1\11\12\6\7\13\32\5\3\13\1\3\1\5\1\13\32\5\uff85\13",
            "",
            "\1\17\1\16\2\uffff\1\16\22\uffff\1\17",
            "\32\20\4\uffff\1\20\1\uffff\32\20",
            "",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\12\22",
            "\12\24\1\26\2\24\1\26\24\24\1\25\11\24\1\26\57\24\1\23\uffa3\24",
            "\12\30\1\26\2\30\1\26\31\30\1\31\4\30\1\26\57\30\1\27\uffa3\30",
            "\1\32\4\uffff\1\33",
            "\1\34\1\17\2\uffff\1\17\22\uffff\1\34",
            "",
            "",
            "",
            "\1\17\1\16\2\uffff\1\16\22\uffff\1\17",
            "",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\12\22",
            "\12\35\1\26\2\35\1\26\36\35\1\26\uffd3\35",
            "\12\24\1\26\2\24\1\26\24\24\1\25\11\24\1\26\57\24\1\23\uffa3\24",
            "",
            "",
            "\12\36\1\26\2\36\1\26\36\36\1\26\uffd3\36",
            "\12\30\1\26\2\30\1\26\31\30\1\31\4\30\1\26\57\30\1\27\uffa3\30",
            "",
            "\12\41\1\40\2\41\1\40\34\41\1\37\1\41\1\40\uffd3\41",
            "\12\42\1\43\2\42\1\43\36\42\1\43\uffd3\42",
            "\1\34\1\17\2\uffff\1\17\22\uffff\1\34",
            "\12\24\1\26\2\24\1\26\24\24\1\25\11\24\1\26\57\24\1\23\uffa3\24",
            "\12\30\1\26\2\30\1\26\31\30\1\31\4\30\1\26\57\30\1\27\uffa3\30",
            "\12\41\1\40\2\41\1\40\34\41\1\37\1\41\1\40\2\41\1\44\uffd0\41",
            "",
            "\12\41\1\40\2\41\1\40\34\41\1\37\1\41\1\40\uffd3\41",
            "\12\42\1\43\2\42\1\43\36\42\1\43\uffd3\42",
            "",
            "\12\41\1\40\2\41\1\40\34\41\1\37\1\41\1\40\uffd3\41"
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | RULE_NL | RULE_FREE_CELL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_30 = input.LA(1);

                        s = -1;
                        if ( (LA14_30=='\'') ) {s = 25;}

                        else if ( (LA14_30=='\\') ) {s = 23;}

                        else if ( ((LA14_30>='\u0000' && LA14_30<='\t')||(LA14_30>='\u000B' && LA14_30<='\f')||(LA14_30>='\u000E' && LA14_30<='&')||(LA14_30>='(' && LA14_30<='+')||(LA14_30>='-' && LA14_30<='[')||(LA14_30>=']' && LA14_30<='\uFFFF')) ) {s = 24;}

                        else if ( (LA14_30=='\n'||LA14_30=='\r'||LA14_30==',') ) {s = 22;}

                        else s = 4;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_24 = input.LA(1);

                        s = -1;
                        if ( (LA14_24=='\'') ) {s = 25;}

                        else if ( (LA14_24=='\\') ) {s = 23;}

                        else if ( ((LA14_24>='\u0000' && LA14_24<='\t')||(LA14_24>='\u000B' && LA14_24<='\f')||(LA14_24>='\u000E' && LA14_24<='&')||(LA14_24>='(' && LA14_24<='+')||(LA14_24>='-' && LA14_24<='[')||(LA14_24>=']' && LA14_24<='\uFFFF')) ) {s = 24;}

                        else if ( (LA14_24=='\n'||LA14_24=='\r'||LA14_24==',') ) {s = 22;}

                        else s = 4;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_27 = input.LA(1);

                        s = -1;
                        if ( ((LA14_27>='\u0000' && LA14_27<='\t')||(LA14_27>='\u000B' && LA14_27<='\f')||(LA14_27>='\u000E' && LA14_27<='+')||(LA14_27>='-' && LA14_27<='\uFFFF')) ) {s = 34;}

                        else if ( (LA14_27=='\n'||LA14_27=='\r'||LA14_27==',') ) {s = 35;}

                        else s = 4;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_7 = input.LA(1);

                        s = -1;
                        if ( (LA14_7=='\\') ) {s = 19;}

                        else if ( ((LA14_7>='\u0000' && LA14_7<='\t')||(LA14_7>='\u000B' && LA14_7<='\f')||(LA14_7>='\u000E' && LA14_7<='!')||(LA14_7>='#' && LA14_7<='+')||(LA14_7>='-' && LA14_7<='[')||(LA14_7>=']' && LA14_7<='\uFFFF')) ) {s = 20;}

                        else if ( (LA14_7=='\"') ) {s = 21;}

                        else if ( (LA14_7=='\n'||LA14_7=='\r'||LA14_7==',') ) {s = 22;}

                        else s = 4;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA14_26 = input.LA(1);

                        s = -1;
                        if ( (LA14_26=='*') ) {s = 31;}

                        else if ( (LA14_26=='\n'||LA14_26=='\r'||LA14_26==',') ) {s = 32;}

                        else if ( ((LA14_26>='\u0000' && LA14_26<='\t')||(LA14_26>='\u000B' && LA14_26<='\f')||(LA14_26>='\u000E' && LA14_26<=')')||LA14_26=='+'||(LA14_26>='-' && LA14_26<='\uFFFF')) ) {s = 33;}

                        else s = 4;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA14_19 = input.LA(1);

                        s = -1;
                        if ( ((LA14_19>='\u0000' && LA14_19<='\t')||(LA14_19>='\u000B' && LA14_19<='\f')||(LA14_19>='\u000E' && LA14_19<='+')||(LA14_19>='-' && LA14_19<='\uFFFF')) ) {s = 29;}

                        else if ( (LA14_19=='\n'||LA14_19=='\r'||LA14_19==',') ) {s = 22;}

                        else s = 4;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA14_31 = input.LA(1);

                        s = -1;
                        if ( (LA14_31=='/') ) {s = 36;}

                        else if ( (LA14_31=='*') ) {s = 31;}

                        else if ( ((LA14_31>='\u0000' && LA14_31<='\t')||(LA14_31>='\u000B' && LA14_31<='\f')||(LA14_31>='\u000E' && LA14_31<=')')||LA14_31=='+'||(LA14_31>='-' && LA14_31<='.')||(LA14_31>='0' && LA14_31<='\uFFFF')) ) {s = 33;}

                        else if ( (LA14_31=='\n'||LA14_31=='\r'||LA14_31==',') ) {s = 32;}

                        else s = 4;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA14_33 = input.LA(1);

                        s = -1;
                        if ( (LA14_33=='*') ) {s = 31;}

                        else if ( ((LA14_33>='\u0000' && LA14_33<='\t')||(LA14_33>='\u000B' && LA14_33<='\f')||(LA14_33>='\u000E' && LA14_33<=')')||LA14_33=='+'||(LA14_33>='-' && LA14_33<='\uFFFF')) ) {s = 33;}

                        else if ( (LA14_33=='\n'||LA14_33=='\r'||LA14_33==',') ) {s = 32;}

                        else s = 4;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA14_23 = input.LA(1);

                        s = -1;
                        if ( ((LA14_23>='\u0000' && LA14_23<='\t')||(LA14_23>='\u000B' && LA14_23<='\f')||(LA14_23>='\u000E' && LA14_23<='+')||(LA14_23>='-' && LA14_23<='\uFFFF')) ) {s = 30;}

                        else if ( (LA14_23=='\n'||LA14_23=='\r'||LA14_23==',') ) {s = 22;}

                        else s = 4;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0==',') ) {s = 1;}

                        else if ( (LA14_0=='\n'||LA14_0=='\r') ) {s = 2;}

                        else if ( (LA14_0=='^') ) {s = 3;}

                        else if ( ((LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='z')) ) {s = 5;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 6;}

                        else if ( (LA14_0=='\"') ) {s = 7;}

                        else if ( (LA14_0=='\'') ) {s = 8;}

                        else if ( (LA14_0=='/') ) {s = 9;}

                        else if ( (LA14_0=='\t'||LA14_0==' ') ) {s = 10;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='+')||(LA14_0>='-' && LA14_0<='.')||(LA14_0>=':' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||(LA14_0>='{' && LA14_0<='\uFFFF')) ) {s = 11;}

                        else s = 4;

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA14_8 = input.LA(1);

                        s = -1;
                        if ( (LA14_8=='\\') ) {s = 23;}

                        else if ( ((LA14_8>='\u0000' && LA14_8<='\t')||(LA14_8>='\u000B' && LA14_8<='\f')||(LA14_8>='\u000E' && LA14_8<='&')||(LA14_8>='(' && LA14_8<='+')||(LA14_8>='-' && LA14_8<='[')||(LA14_8>=']' && LA14_8<='\uFFFF')) ) {s = 24;}

                        else if ( (LA14_8=='\'') ) {s = 25;}

                        else if ( (LA14_8=='\n'||LA14_8=='\r'||LA14_8==',') ) {s = 22;}

                        else s = 4;

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA14_36 = input.LA(1);

                        s = -1;
                        if ( (LA14_36=='*') ) {s = 31;}

                        else if ( ((LA14_36>='\u0000' && LA14_36<='\t')||(LA14_36>='\u000B' && LA14_36<='\f')||(LA14_36>='\u000E' && LA14_36<=')')||LA14_36=='+'||(LA14_36>='-' && LA14_36<='\uFFFF')) ) {s = 33;}

                        else if ( (LA14_36=='\n'||LA14_36=='\r'||LA14_36==',') ) {s = 32;}

                        else s = 4;

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA14_29 = input.LA(1);

                        s = -1;
                        if ( (LA14_29=='\"') ) {s = 21;}

                        else if ( (LA14_29=='\\') ) {s = 19;}

                        else if ( ((LA14_29>='\u0000' && LA14_29<='\t')||(LA14_29>='\u000B' && LA14_29<='\f')||(LA14_29>='\u000E' && LA14_29<='!')||(LA14_29>='#' && LA14_29<='+')||(LA14_29>='-' && LA14_29<='[')||(LA14_29>=']' && LA14_29<='\uFFFF')) ) {s = 20;}

                        else if ( (LA14_29=='\n'||LA14_29=='\r'||LA14_29==',') ) {s = 22;}

                        else s = 4;

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA14_20 = input.LA(1);

                        s = -1;
                        if ( (LA14_20=='\"') ) {s = 21;}

                        else if ( (LA14_20=='\\') ) {s = 19;}

                        else if ( ((LA14_20>='\u0000' && LA14_20<='\t')||(LA14_20>='\u000B' && LA14_20<='\f')||(LA14_20>='\u000E' && LA14_20<='!')||(LA14_20>='#' && LA14_20<='+')||(LA14_20>='-' && LA14_20<='[')||(LA14_20>=']' && LA14_20<='\uFFFF')) ) {s = 20;}

                        else if ( (LA14_20=='\n'||LA14_20=='\r'||LA14_20==',') ) {s = 22;}

                        else s = 4;

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA14_34 = input.LA(1);

                        s = -1;
                        if ( ((LA14_34>='\u0000' && LA14_34<='\t')||(LA14_34>='\u000B' && LA14_34<='\f')||(LA14_34>='\u000E' && LA14_34<='+')||(LA14_34>='-' && LA14_34<='\uFFFF')) ) {s = 34;}

                        else if ( (LA14_34=='\n'||LA14_34=='\r'||LA14_34==',') ) {s = 35;}

                        else s = 4;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}