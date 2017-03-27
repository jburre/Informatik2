package halstead.lexer;


import org.antlr.runtime.*;


public class HalsteadLexer extends Lexer {
    public static final int STAT=11;
    public static final int HEADER_FILE=6;
    public static final int OPERATOR=13;
    public static final int NUMBER=16;
    public static final int CHAR=18;
    public static final int INT=20;
    public static final int IGNORE=7;
    public static final int SCSPEC=8;
    public static final int EOF=-1;
    public static final int WS=21;
    public static final int RESERVED=10;
    public static final int IDENTIFIER=15;
    public static final int OPERAND=19;
    public static final int SL_COMMENT=5;
    public static final int OPERATORS=12;
    public static final int TYPESPEC=14;
    public static final int TYPE_QUAL=9;
    public static final int COMMENT=4;
    public static final int STRING=17;

    // delegates
    // delegators

    public HalsteadLexer() {;} 
    public HalsteadLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public HalsteadLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g"; }

    // $ANTLR start "IGNORE"
    public final void mIGNORE() throws RecognitionException {
        try {
            int _type = IGNORE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:8:7: ( COMMENT | SL_COMMENT | 'do' | ':' | ')' | '}' | ']' | HEADER_FILE )
            int alt1=8;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:9:4: COMMENT
                    {
                    mCOMMENT(); 

                    }
                    break;
                case 2 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:10:4: SL_COMMENT
                    {
                    mSL_COMMENT(); 

                    }
                    break;
                case 3 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:11:4: 'do'
                    {
                    match("do"); 


                    }
                    break;
                case 4 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:11:11: ':'
                    {
                    match(':'); 

                    }
                    break;
                case 5 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:11:17: ')'
                    {
                    match(')'); 

                    }
                    break;
                case 6 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:11:23: '}'
                    {
                    match('}'); 

                    }
                    break;
                case 7 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:11:29: ']'
                    {
                    match(']'); 

                    }
                    break;
                case 8 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:12:4: HEADER_FILE
                    {
                    mHEADER_FILE(); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IGNORE"

    // $ANTLR start "OPERATOR"
    public final void mOPERATOR() throws RecognitionException {
        try {
            int _type = OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:15:9: ( ( SCSPEC | TYPE_QUAL | RESERVED | STAT | OPERATORS ) )
            // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:16:2: ( SCSPEC | TYPE_QUAL | RESERVED | STAT | OPERATORS )
            {
            // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:16:2: ( SCSPEC | TYPE_QUAL | RESERVED | STAT | OPERATORS )
            int alt2=5;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:16:4: SCSPEC
                    {
                    mSCSPEC(); 

                    }
                    break;
                case 2 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:17:4: TYPE_QUAL
                    {
                    mTYPE_QUAL(); 

                    }
                    break;
                case 3 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:18:4: RESERVED
                    {
                    mRESERVED(); 

                    }
                    break;
                case 4 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:19:4: STAT
                    {
                    mSTAT(); 

                    }
                    break;
                case 5 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:20:4: OPERATORS
                    {
                    mOPERATORS(); 

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
    // $ANTLR end "OPERATOR"

    // $ANTLR start "OPERAND"
    public final void mOPERAND() throws RecognitionException {
        try {
            int _type = OPERAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:24:8: ( ( TYPESPEC | IDENTIFIER | NUMBER | STRING | CHAR ) )
            // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:25:2: ( TYPESPEC | IDENTIFIER | NUMBER | STRING | CHAR )
            {
            // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:25:2: ( TYPESPEC | IDENTIFIER | NUMBER | STRING | CHAR )
            int alt3=5;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:25:4: TYPESPEC
                    {
                    mTYPESPEC(); 

                    }
                    break;
                case 2 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:26:4: IDENTIFIER
                    {
                    mIDENTIFIER(); 

                    }
                    break;
                case 3 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:27:4: NUMBER
                    {
                    mNUMBER(); 

                    }
                    break;
                case 4 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:28:4: STRING
                    {
                    mSTRING(); 

                    }
                    break;
                case 5 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:29:4: CHAR
                    {
                    mCHAR(); 

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
    // $ANTLR end "OPERAND"

    // $ANTLR start "TYPESPEC"
    public final void mTYPESPEC() throws RecognitionException {
        try {
            // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:34:9: ( 'bool' | 'char' | 'double' | 'float' | 'int' | 'long' | 'short' | 'signed' | 'unsigned' | 'void' )
            int alt4=10;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:35:2: 'bool'
                    {
                    match("bool"); 


                    }
                    break;
                case 2 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:35:10: 'char'
                    {
                    match("char"); 


                    }
                    break;
                case 3 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:35:19: 'double'
                    {
                    match("double"); 


                    }
                    break;
                case 4 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:35:30: 'float'
                    {
                    match("float"); 


                    }
                    break;
                case 5 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:35:40: 'int'
                    {
                    match("int"); 


                    }
                    break;
                case 6 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:35:48: 'long'
                    {
                    match("long"); 


                    }
                    break;
                case 7 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:35:57: 'short'
                    {
                    match("short"); 


                    }
                    break;
                case 8 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:35:67: 'signed'
                    {
                    match("signed"); 


                    }
                    break;
                case 9 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:35:78: 'unsigned'
                    {
                    match("unsigned"); 


                    }
                    break;
                case 10 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:35:91: 'void'
                    {
                    match("void"); 


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "TYPESPEC"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:37:8: ( INT ( '.' INT )? )
            // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:37:10: INT ( '.' INT )?
            {
            mINT(); 
            // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:37:14: ( '.' INT )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='.') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:37:15: '.' INT
                    {
                    match('.'); 
                    mINT(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:40:5: ( ( '0' .. '9' )+ )
            // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:40:7: ( '0' .. '9' )+
            {
            // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:40:7: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:40:7: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:43:8: ( '\"' ( . )* '\"' )
            // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:43:10: '\"' ( . )* '\"'
            {
            match('\"'); 
            // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:43:14: ( . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\"') ) {
                    alt7=2;
                }
                else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:43:14: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match('\"'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:47:6: ( '\\'' ( . )* '\\'' )
            // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:47:8: '\\'' ( . )* '\\''
            {
            match('\''); 
            // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:47:13: ( . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='\'') ) {
                    alt8=2;
                }
                else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:47:13: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match('\''); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "SCSPEC"
    public final void mSCSPEC() throws RecognitionException {
        try {
            // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:50:8: ( 'auto' | 'extern' | 'inline' | 'register' | 'static' | 'typedef' | 'virtual' | 'mutable' )
            int alt9=8;
            switch ( input.LA(1) ) {
            case 'a':
                {
                alt9=1;
                }
                break;
            case 'e':
                {
                alt9=2;
                }
                break;
            case 'i':
                {
                alt9=3;
                }
                break;
            case 'r':
                {
                alt9=4;
                }
                break;
            case 's':
                {
                alt9=5;
                }
                break;
            case 't':
                {
                alt9=6;
                }
                break;
            case 'v':
                {
                alt9=7;
                }
                break;
            case 'm':
                {
                alt9=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:51:2: 'auto'
                    {
                    match("auto"); 


                    }
                    break;
                case 2 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:51:9: 'extern'
                    {
                    match("extern"); 


                    }
                    break;
                case 3 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:51:18: 'inline'
                    {
                    match("inline"); 


                    }
                    break;
                case 4 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:51:27: 'register'
                    {
                    match("register"); 


                    }
                    break;
                case 5 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:51:38: 'static'
                    {
                    match("static"); 


                    }
                    break;
                case 6 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:51:47: 'typedef'
                    {
                    match("typedef"); 


                    }
                    break;
                case 7 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:51:57: 'virtual'
                    {
                    match("virtual"); 


                    }
                    break;
                case 8 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:51:67: 'mutable'
                    {
                    match("mutable"); 


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "SCSPEC"

    // $ANTLR start "RESERVED"
    public final void mRESERVED() throws RecognitionException {
        try {
            // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:54:9: ( 'asm' | 'break' | 'case' | 'class' | 'continue' | 'default' | 'delete' | 'else' | 'enum' | 'goto' | 'new' | 'operator' | 'private' | 'protected' | 'public' | 'return' | 'sizeof' | 'struct' | 'this' | 'union' | 'namespace' | 'using' | 'try' | 'catch' | 'throw' | 'const_cast' | 'static_cast' | 'dynamic_cast' | 'reiznterpret_cast' | 'typeid' | 'template' | 'explicit' | 'true' | 'false' | 'typename' )
            int alt10=35;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:55:3: 'asm'
                    {
                    match("asm"); 


                    }
                    break;
                case 2 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:55:9: 'break'
                    {
                    match("break"); 


                    }
                    break;
                case 3 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:55:17: 'case'
                    {
                    match("case"); 


                    }
                    break;
                case 4 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:55:24: 'class'
                    {
                    match("class"); 


                    }
                    break;
                case 5 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:55:32: 'continue'
                    {
                    match("continue"); 


                    }
                    break;
                case 6 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:55:43: 'default'
                    {
                    match("default"); 


                    }
                    break;
                case 7 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:55:53: 'delete'
                    {
                    match("delete"); 


                    }
                    break;
                case 8 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:55:62: 'else'
                    {
                    match("else"); 


                    }
                    break;
                case 9 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:56:3: 'enum'
                    {
                    match("enum"); 


                    }
                    break;
                case 10 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:56:10: 'goto'
                    {
                    match("goto"); 


                    }
                    break;
                case 11 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:56:17: 'new'
                    {
                    match("new"); 


                    }
                    break;
                case 12 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:56:23: 'operator'
                    {
                    match("operator"); 


                    }
                    break;
                case 13 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:56:34: 'private'
                    {
                    match("private"); 


                    }
                    break;
                case 14 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:57:3: 'protected'
                    {
                    match("protected"); 


                    }
                    break;
                case 15 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:57:15: 'public'
                    {
                    match("public"); 


                    }
                    break;
                case 16 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:57:24: 'return'
                    {
                    match("return"); 


                    }
                    break;
                case 17 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:57:33: 'sizeof'
                    {
                    match("sizeof"); 


                    }
                    break;
                case 18 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:57:42: 'struct'
                    {
                    match("struct"); 


                    }
                    break;
                case 19 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:58:3: 'this'
                    {
                    match("this"); 


                    }
                    break;
                case 20 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:58:10: 'union'
                    {
                    match("union"); 


                    }
                    break;
                case 21 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:58:18: 'namespace'
                    {
                    match("namespace"); 


                    }
                    break;
                case 22 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:58:30: 'using'
                    {
                    match("using"); 


                    }
                    break;
                case 23 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:59:3: 'try'
                    {
                    match("try"); 


                    }
                    break;
                case 24 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:59:9: 'catch'
                    {
                    match("catch"); 


                    }
                    break;
                case 25 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:59:17: 'throw'
                    {
                    match("throw"); 


                    }
                    break;
                case 26 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:59:25: 'const_cast'
                    {
                    match("const_cast"); 


                    }
                    break;
                case 27 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:59:38: 'static_cast'
                    {
                    match("static_cast"); 


                    }
                    break;
                case 28 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:60:3: 'dynamic_cast'
                    {
                    match("dynamic_cast"); 


                    }
                    break;
                case 29 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:60:18: 'reiznterpret_cast'
                    {
                    match("reiznterpret_cast"); 


                    }
                    break;
                case 30 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:60:38: 'typeid'
                    {
                    match("typeid"); 


                    }
                    break;
                case 31 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:60:47: 'template'
                    {
                    match("template"); 


                    }
                    break;
                case 32 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:61:3: 'explicit'
                    {
                    match("explicit"); 


                    }
                    break;
                case 33 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:61:14: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 34 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:61:21: 'false'
                    {
                    match("false"); 


                    }
                    break;
                case 35 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:61:29: 'typename'
                    {
                    match("typename"); 


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "RESERVED"

    // $ANTLR start "TYPE_QUAL"
    public final void mTYPE_QUAL() throws RecognitionException {
        try {
            // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:64:10: ( 'const' | 'friend' | 'volatile' )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 'c':
                {
                alt11=1;
                }
                break;
            case 'f':
                {
                alt11=2;
                }
                break;
            case 'v':
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:65:2: 'const'
                    {
                    match("const"); 


                    }
                    break;
                case 2 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:65:10: 'friend'
                    {
                    match("friend"); 


                    }
                    break;
                case 3 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:65:19: 'volatile'
                    {
                    match("volatile"); 


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "TYPE_QUAL"

    // $ANTLR start "STAT"
    public final void mSTAT() throws RecognitionException {
        try {
            // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:69:6: ( ( 'if' | 'while' | 'switch' | 'for' ) ( ' ' )* '(' )
            // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:69:8: ( 'if' | 'while' | 'switch' | 'for' ) ( ' ' )* '('
            {
            // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:69:8: ( 'if' | 'while' | 'switch' | 'for' )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 'i':
                {
                alt12=1;
                }
                break;
            case 'w':
                {
                alt12=2;
                }
                break;
            case 's':
                {
                alt12=3;
                }
                break;
            case 'f':
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:69:9: 'if'
                    {
                    match("if"); 


                    }
                    break;
                case 2 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:69:14: 'while'
                    {
                    match("while"); 


                    }
                    break;
                case 3 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:69:22: 'switch'
                    {
                    match("switch"); 


                    }
                    break;
                case 4 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:69:31: 'for'
                    {
                    match("for"); 


                    }
                    break;

            }

            // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:69:38: ( ' ' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:69:38: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            match('('); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "STAT"

    // $ANTLR start "OPERATORS"
    public final void mOPERATORS() throws RecognitionException {
        try {
            // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:73:10: ( '!' | '!=' | '%' | '%=' | '&' | '&&' | '&=' | '(' | '*' | '*=' | '+' | '++' | '+=' | ',' | '-' | '--' | '-=' | '->' | '...' | '/' | '/=' | '::' | '<' | '<<' | '<<=' | '<=' | '==' | '>' | '>=' | '>>' | '>>=' | '?' | '[' | '^' | '^=' | '{' | '||' | '=' | '~' | ';' )
            int alt14=40;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:74:2: '!'
                    {
                    match('!'); 

                    }
                    break;
                case 2 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:74:6: '!='
                    {
                    match("!="); 


                    }
                    break;
                case 3 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:74:11: '%'
                    {
                    match('%'); 

                    }
                    break;
                case 4 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:74:15: '%='
                    {
                    match("%="); 


                    }
                    break;
                case 5 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:74:20: '&'
                    {
                    match('&'); 

                    }
                    break;
                case 6 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:74:24: '&&'
                    {
                    match("&&"); 


                    }
                    break;
                case 7 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:74:29: '&='
                    {
                    match("&="); 


                    }
                    break;
                case 8 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:74:34: '('
                    {
                    match('('); 

                    }
                    break;
                case 9 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:74:38: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 10 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:74:42: '*='
                    {
                    match("*="); 


                    }
                    break;
                case 11 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:75:3: '+'
                    {
                    match('+'); 

                    }
                    break;
                case 12 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:75:7: '++'
                    {
                    match("++"); 


                    }
                    break;
                case 13 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:75:12: '+='
                    {
                    match("+="); 


                    }
                    break;
                case 14 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:75:17: ','
                    {
                    match(','); 

                    }
                    break;
                case 15 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:75:21: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 16 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:75:25: '--'
                    {
                    match("--"); 


                    }
                    break;
                case 17 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:75:30: '-='
                    {
                    match("-="); 


                    }
                    break;
                case 18 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:75:35: '->'
                    {
                    match("->"); 


                    }
                    break;
                case 19 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:75:40: '...'
                    {
                    match("..."); 


                    }
                    break;
                case 20 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:75:46: '/'
                    {
                    match('/'); 

                    }
                    break;
                case 21 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:76:3: '/='
                    {
                    match("/="); 


                    }
                    break;
                case 22 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:76:8: '::'
                    {
                    match("::"); 


                    }
                    break;
                case 23 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:76:13: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 24 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:76:17: '<<'
                    {
                    match("<<"); 


                    }
                    break;
                case 25 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:76:22: '<<='
                    {
                    match("<<="); 


                    }
                    break;
                case 26 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:76:28: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 27 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:76:33: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 28 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:76:38: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 29 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:76:42: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 30 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:76:47: '>>'
                    {
                    match(">>"); 


                    }
                    break;
                case 31 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:77:3: '>>='
                    {
                    match(">>="); 


                    }
                    break;
                case 32 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:77:9: '?'
                    {
                    match('?'); 

                    }
                    break;
                case 33 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:77:13: '['
                    {
                    match('['); 

                    }
                    break;
                case 34 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:77:17: '^'
                    {
                    match('^'); 

                    }
                    break;
                case 35 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:77:21: '^='
                    {
                    match("^="); 


                    }
                    break;
                case 36 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:77:26: '{'
                    {
                    match('{'); 

                    }
                    break;
                case 37 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:77:30: '||'
                    {
                    match("||"); 


                    }
                    break;
                case 38 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:77:35: '='
                    {
                    match('='); 

                    }
                    break;
                case 39 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:77:39: '~'
                    {
                    match('~'); 

                    }
                    break;
                case 40 :
                    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:77:43: ';'
                    {
                    match(';'); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "OPERATORS"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:81:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:82:2: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:82:26: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='0' && LA15_0<='9')||(LA15_0>='A' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='a' && LA15_0<='z')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:
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
            	    break loop15;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:85:9: ( '/*' ( . )* '*/' )
            // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:85:11: '/*' ( . )* '*/'
            {
            match("/*"); 

            // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:85:16: ( . )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0=='*') ) {
                    int LA16_1 = input.LA(2);

                    if ( (LA16_1=='/') ) {
                        alt16=2;
                    }
                    else if ( ((LA16_1>='\u0000' && LA16_1<='.')||(LA16_1>='0' && LA16_1<='\uFFFF')) ) {
                        alt16=1;
                    }


                }
                else if ( ((LA16_0>='\u0000' && LA16_0<=')')||(LA16_0>='+' && LA16_0<='\uFFFF')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:85:16: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            match("*/"); 


            }

        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "SL_COMMENT"
    public final void mSL_COMMENT() throws RecognitionException {
        try {
            // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:89:6: ( '//' ( . )* '\\n' )
            // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:89:8: '//' ( . )* '\\n'
            {
            match("//"); 

            // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:89:13: ( . )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0=='\n') ) {
                    alt17=2;
                }
                else if ( ((LA17_0>='\u0000' && LA17_0<='\t')||(LA17_0>='\u000B' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:89:13: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            match('\n'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "SL_COMMENT"

    // $ANTLR start "HEADER_FILE"
    public final void mHEADER_FILE() throws RecognitionException {
        try {
            // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:92:12: ( '#include' ( ' ' )+ '<' IDENTIFIER '.h>' )
            // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:92:14: '#include' ( ' ' )+ '<' IDENTIFIER '.h>'
            {
            match("#include"); 

            // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:92:25: ( ' ' )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==' ') ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:92:25: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            match('<'); 
            mIDENTIFIER(); 
            match(".h>"); 


            }

        }
        finally {
        }
    }
    // $ANTLR end "HEADER_FILE"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:95:6: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:95:8: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:95:8: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='\t' && LA19_0<='\n')||LA19_0=='\r'||LA19_0==' ') ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:
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
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);

            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:1:8: ( IGNORE | OPERATOR | OPERAND | WS )
        int alt20=4;
        alt20 = dfa20.predict(input);
        switch (alt20) {
            case 1 :
                // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:1:10: IGNORE
                {
                mIGNORE(); 

                }
                break;
            case 2 :
                // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:1:17: OPERATOR
                {
                mOPERATOR(); 

                }
                break;
            case 3 :
                // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:1:26: OPERAND
                {
                mOPERAND(); 

                }
                break;
            case 4 :
                // /Users/krohnu/Documents/co/praktikum/halstead/uwe/HalsteadLexer.g:1:34: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA1_eotS =
        "\12\uffff";
    static final String DFA1_eofS =
        "\12\uffff";
    static final String DFA1_minS =
        "\1\43\1\52\10\uffff";
    static final String DFA1_maxS =
        "\1\175\1\57\10\uffff";
    static final String DFA1_acceptS =
        "\2\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\1\1\2";
    static final String DFA1_specialS =
        "\12\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\7\5\uffff\1\4\5\uffff\1\1\12\uffff\1\3\42\uffff\1\6\6\uffff"+
            "\1\2\30\uffff\1\5",
            "\1\10\4\uffff\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "8:1: IGNORE : ( COMMENT | SL_COMMENT | 'do' | ':' | ')' | '}' | ']' | HEADER_FILE );";
        }
    }
    static final String DFA2_eotS =
        "\33\uffff\1\22\1\10";
    static final String DFA2_eofS =
        "\35\uffff";
    static final String DFA2_minS =
        "\1\41\1\163\1\154\1\146\1\145\1\151\1\145\1\151\1\uffff\2\141\3"+
        "\uffff\1\160\1\147\1\141\1\160\1\uffff\1\156\1\164\1\145\1\163\1"+
        "\151\1\144\1\164\1\143\2\137";
    static final String DFA2_maxS =
        "\1\176\1\165\1\170\1\156\1\145\1\167\1\171\1\157\1\uffff\1\157\1"+
        "\162\3\uffff\2\164\1\162\1\160\1\uffff\1\156\1\164\1\145\1\164\1"+
        "\151\1\156\1\164\1\143\2\137";
    static final String DFA2_acceptS =
        "\10\uffff\1\1\2\uffff\1\3\1\4\1\5\4\uffff\1\2\12\uffff";
    static final String DFA2_specialS =
        "\35\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\15\3\uffff\2\15\1\uffff\1\15\1\uffff\6\15\12\uffff\6\15\33"+
            "\uffff\1\15\2\uffff\1\15\2\uffff\1\1\1\13\1\11\1\13\1\2\1\12"+
            "\1\13\1\uffff\1\3\3\uffff\1\10\3\13\1\uffff\1\4\1\5\1\6\1\13"+
            "\1\7\1\14\3\uffff\2\15\1\uffff\1\15",
            "\1\13\1\uffff\1\10",
            "\1\13\1\uffff\1\13\11\uffff\1\16",
            "\1\14\7\uffff\1\10",
            "\1\17",
            "\1\13\12\uffff\1\20\2\uffff\1\14",
            "\1\13\2\uffff\1\13\11\uffff\1\13\6\uffff\1\21",
            "\1\10\5\uffff\1\22",
            "",
            "\1\13\12\uffff\1\13\2\uffff\1\23",
            "\1\13\15\uffff\1\14\2\uffff\1\22",
            "",
            "",
            "",
            "\1\13\3\uffff\1\10",
            "\1\10\1\uffff\1\13\12\uffff\1\13",
            "\1\24\20\uffff\1\13",
            "\1\25",
            "",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\31\1\13",
            "\1\32",
            "\1\10\4\uffff\1\13\4\uffff\1\13",
            "\1\33",
            "\1\34",
            "\1\13",
            "\1\13"
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "16:2: ( SCSPEC | TYPE_QUAL | RESERVED | STAT | OPERATORS )";
        }
    }
    static final String DFA3_eotS =
        "\1\uffff\11\12\4\uffff\16\12\1\uffff\5\12\2\uffff\2\12\1\uffff\3"+
        "\12\1\uffff\1\12\2\uffff\2\12\2\uffff\2\12\1\uffff";
    static final String DFA3_eofS =
        "\65\uffff";
    static final String DFA3_minS =
        "\1\42\1\157\1\150\1\157\1\154\1\156\1\157\1\150\1\156\1\157\4\uffff"+
        "\1\157\1\141\1\165\1\157\1\164\1\156\1\157\1\147\1\163\1\151\1\154"+
        "\1\162\1\142\1\141\1\uffff\1\147\1\162\1\156\1\151\1\144\2\uffff"+
        "\1\154\1\164\1\uffff\1\164\1\145\1\147\1\uffff\1\145\2\uffff\1\144"+
        "\1\156\2\uffff\1\145\1\144\1\uffff";
    static final String DFA3_maxS =
        "\1\172\1\157\1\150\1\157\1\154\1\156\1\157\1\151\1\156\1\157\4\uffff"+
        "\1\157\1\141\1\165\1\157\1\164\1\156\1\157\1\147\1\163\1\151\1\154"+
        "\1\162\1\142\1\141\1\uffff\1\147\1\162\1\156\1\151\1\144\2\uffff"+
        "\1\154\1\164\1\uffff\1\164\1\145\1\147\1\uffff\1\145\2\uffff\1\144"+
        "\1\156\2\uffff\1\145\1\144\1\uffff";
    static final String DFA3_acceptS =
        "\12\uffff\1\2\1\3\1\4\1\5\16\uffff\1\1\5\uffff\2\1\2\uffff\1\1\3"+
        "\uffff\1\1\1\uffff\2\1\2\uffff\2\1\2\uffff\1\1";
    static final String DFA3_specialS =
        "\65\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\14\4\uffff\1\15\10\uffff\12\13\7\uffff\32\12\4\uffff\1\12"+
            "\1\uffff\1\12\1\1\1\2\1\3\1\12\1\4\2\12\1\5\2\12\1\6\6\12\1"+
            "\7\1\12\1\10\1\11\4\12",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\24\1\25",
            "\1\26",
            "\1\27",
            "",
            "",
            "",
            "",
            "\1\30",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "",
            "",
            "\1\53",
            "\1\54",
            "",
            "\1\55",
            "\1\56",
            "\1\57",
            "",
            "\1\60",
            "",
            "",
            "\1\61",
            "\1\62",
            "",
            "",
            "\1\63",
            "\1\64",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "25:2: ( TYPESPEC | IDENTIFIER | NUMBER | STRING | CHAR )";
        }
    }
    static final String DFA4_eotS =
        "\14\uffff";
    static final String DFA4_eofS =
        "\14\uffff";
    static final String DFA4_minS =
        "\1\142\6\uffff\1\150\4\uffff";
    static final String DFA4_maxS =
        "\1\166\6\uffff\1\151\4\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\11\1\12\1\7\1\10";
    static final String DFA4_specialS =
        "\14\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1\1\2\1\3\1\uffff\1\4\2\uffff\1\5\2\uffff\1\6\6\uffff\1\7"+
            "\1\uffff\1\10\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\12\1\13",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "33:1: fragment TYPESPEC : ( 'bool' | 'char' | 'double' | 'float' | 'int' | 'long' | 'short' | 'signed' | 'unsigned' | 'void' );";
        }
    }
    static final String DFA10_eotS =
        "\71\uffff";
    static final String DFA10_eofS =
        "\71\uffff";
    static final String DFA10_minS =
        "\1\141\2\uffff\1\141\1\145\1\154\1\uffff\1\141\1\uffff\1\162\1\145"+
        "\1\151\1\145\1\156\1\uffff\1\163\1\uffff\1\156\1\146\6\uffff\1\151"+
        "\1\uffff\1\151\1\uffff\1\141\1\151\1\165\1\160\5\uffff\1\163\14"+
        "\uffff\1\145\2\uffff\1\151\2\uffff";
    static final String DFA10_maxS =
        "\1\165\2\uffff\1\157\1\171\1\170\1\uffff\1\145\1\uffff\1\165\1\145"+
        "\1\164\1\171\1\163\1\uffff\1\164\1\uffff\1\156\1\154\6\uffff\1\157"+
        "\1\uffff\1\164\1\uffff\2\162\1\171\1\160\5\uffff\1\164\14\uffff"+
        "\1\145\2\uffff\1\156\2\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\1\2\3\uffff\1\12\1\uffff\1\14\5\uffff\1\42\1\uffff"+
        "\1\4\2\uffff\1\34\1\10\1\11\1\40\1\13\1\25\1\uffff\1\17\1\uffff"+
        "\1\21\4\uffff\1\37\1\24\1\26\1\3\1\30\1\uffff\1\6\1\7\1\15\1\16"+
        "\1\20\1\35\1\22\1\33\1\23\1\31\1\27\1\41\1\uffff\1\5\1\32\1\uffff"+
        "\1\36\1\43";
    static final String DFA10_specialS =
        "\71\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\1\1\2\1\3\1\4\1\5\1\16\1\6\6\uffff\1\7\1\10\1\11\1\uffff"+
            "\1\12\1\13\1\14\1\15",
            "",
            "",
            "\1\17\12\uffff\1\20\2\uffff\1\21",
            "\1\22\23\uffff\1\23",
            "\1\24\1\uffff\1\25\11\uffff\1\26",
            "",
            "\1\30\3\uffff\1\27",
            "",
            "\1\31\2\uffff\1\32",
            "\1\33",
            "\1\34\12\uffff\1\35",
            "\1\41\2\uffff\1\36\11\uffff\1\37\6\uffff\1\40",
            "\1\42\4\uffff\1\43",
            "",
            "\1\44\1\45",
            "",
            "\1\46",
            "\1\47\5\uffff\1\50",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\51\5\uffff\1\52",
            "",
            "\1\54\12\uffff\1\53",
            "",
            "\1\56\20\uffff\1\55",
            "\1\57\10\uffff\1\60",
            "\1\62\3\uffff\1\61",
            "\1\63",
            "",
            "",
            "",
            "",
            "",
            "\1\65\1\64",
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
            "\1\66",
            "",
            "",
            "\1\67\4\uffff\1\70",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "53:1: fragment RESERVED : ( 'asm' | 'break' | 'case' | 'class' | 'continue' | 'default' | 'delete' | 'else' | 'enum' | 'goto' | 'new' | 'operator' | 'private' | 'protected' | 'public' | 'return' | 'sizeof' | 'struct' | 'this' | 'union' | 'namespace' | 'using' | 'try' | 'catch' | 'throw' | 'const_cast' | 'static_cast' | 'dynamic_cast' | 'reiznterpret_cast' | 'typeid' | 'template' | 'explicit' | 'true' | 'false' | 'typename' );";
        }
    }
    static final String DFA14_eotS =
        "\1\uffff\1\27\1\31\1\34\1\uffff\1\36\1\41\1\uffff\1\45\1\uffff\1"+
        "\47\1\uffff\1\52\1\54\1\57\2\uffff\1\61\26\uffff\1\63\5\uffff\1"+
        "\65\7\uffff";
    static final String DFA14_eofS =
        "\66\uffff";
    static final String DFA14_minS =
        "\1\41\2\75\1\46\1\uffff\1\75\1\53\1\uffff\1\55\1\uffff\1\75\1\uffff"+
        "\1\74\2\75\2\uffff\1\75\26\uffff\1\75\5\uffff\1\75\7\uffff";
    static final String DFA14_maxS =
        "\1\176\3\75\1\uffff\2\75\1\uffff\1\76\1\uffff\1\75\1\uffff\2\75"+
        "\1\76\2\uffff\1\75\26\uffff\1\75\5\uffff\1\75\7\uffff";
    static final String DFA14_acceptS =
        "\4\uffff\1\10\2\uffff\1\16\1\uffff\1\23\1\uffff\1\26\3\uffff\1\40"+
        "\1\41\1\uffff\1\44\1\45\1\47\1\50\1\2\1\1\1\4\1\3\1\6\1\7\1\5\1"+
        "\12\1\11\1\14\1\15\1\13\1\20\1\21\1\22\1\17\1\25\1\24\1\uffff\1"+
        "\32\1\27\1\33\1\46\1\35\1\uffff\1\34\1\43\1\42\1\31\1\30\1\37\1"+
        "\36";
    static final String DFA14_specialS =
        "\66\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\1\3\uffff\1\2\1\3\1\uffff\1\4\1\uffff\1\5\1\6\1\7\1\10\1"+
            "\11\1\12\12\uffff\1\13\1\25\1\14\1\15\1\16\1\17\33\uffff\1\20"+
            "\2\uffff\1\21\34\uffff\1\22\1\23\1\uffff\1\24",
            "\1\26",
            "\1\30",
            "\1\32\26\uffff\1\33",
            "",
            "\1\35",
            "\1\37\21\uffff\1\40",
            "",
            "\1\42\17\uffff\1\43\1\44",
            "",
            "\1\46",
            "",
            "\1\50\1\51",
            "\1\53",
            "\1\55\1\56",
            "",
            "",
            "\1\60",
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
            "\1\62",
            "",
            "",
            "",
            "",
            "",
            "\1\64",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
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
            return "72:1: fragment OPERATORS : ( '!' | '!=' | '%' | '%=' | '&' | '&&' | '&=' | '(' | '*' | '*=' | '+' | '++' | '+=' | ',' | '-' | '--' | '-=' | '->' | '...' | '/' | '/=' | '::' | '<' | '<<' | '<<=' | '<=' | '==' | '>' | '>=' | '>>' | '>>=' | '?' | '[' | '^' | '^=' | '{' | '||' | '=' | '~' | ';' );";
        }
    }
    static final String DFA20_eotS =
        "\1\uffff\1\26\1\27\1\4\1\uffff\21\27\3\uffff\1\4\50\27\1\26\17\27"+
        "\1\26\16\27\1\26\13\27\1\26\2\27\2\26\11\27\1\26\1\27\1\26\6\27"+
        "\1\26\5\27\1\26\30\27\1\26\4\27\1\26\1\27\2\26\1\27\2\26\5\27\2"+
        "\26\2\27\1\26\1\27\1\26\1\27\1\26\1\27\1\26\1\27\3\26\2\27\1\26"+
        "\7\27\1\26\4\27\2\26\5\27\1\26\2\27\1\26\1\27\1\26\4\27\1\26\2\27"+
        "\2\26\2\27\3\26\1\27\1\26\1\27\1\26\5\27\2\26\3\27\1\26\2\27\2\26"+
        "\5\27\1\26";
    static final String DFA20_eofS =
        "\u0106\uffff";
    static final String DFA20_minS =
        "\1\11\1\52\1\145\1\72\1\uffff\1\163\1\154\1\146\1\145\1\151\1\145"+
        "\1\151\1\165\2\141\1\162\1\157\1\141\1\160\1\162\1\156\1\150\3\uffff"+
        "\1\60\1\146\1\156\1\164\1\155\1\160\1\163\1\165\1\154\1\40\1\147"+
        "\1\141\1\172\1\151\1\160\1\151\1\165\1\155\1\162\1\154\1\164\1\156"+
        "\1\163\1\141\1\151\1\154\1\162\1\145\1\164\1\167\1\155\1\145\1\151"+
        "\1\142\3\151\1\141\1\145\1\141\1\157\1\60\1\145\1\154\1\145\1\155"+
        "\2\151\1\165\1\172\1\164\1\165\1\145\1\164\1\145\1\163\1\157\1\60"+
        "\1\145\1\160\1\164\2\141\1\163\1\145\1\143\1\163\1\145\1\163\1\40"+
        "\1\141\1\157\1\60\1\145\1\162\1\166\1\164\1\154\1\157\1\156\1\154"+
        "\1\165\1\164\1\155\1\60\1\162\1\151\2\60\1\156\1\163\1\162\1\156"+
        "\1\151\1\143\1\157\1\143\1\144\1\60\1\167\1\60\1\154\1\165\1\164"+
        "\1\142\1\164\1\151\1\60\1\150\1\163\1\156\1\145\1\153\1\60\1\163"+
        "\2\141\1\145\1\151\1\156\1\147\1\145\1\154\1\145\1\151\1\156\1\143"+
        "\1\145\1\164\1\156\1\164\1\143\1\164\1\146\1\150\1\145\1\144\1\141"+
        "\1\60\2\141\1\151\1\154\1\60\1\156\2\60\1\144\2\60\1\160\2\164\2"+
        "\143\2\60\1\40\1\164\1\60\1\143\1\60\1\151\1\60\1\145\1\60\1\145"+
        "\3\60\1\40\1\146\1\60\1\155\1\164\2\154\1\145\1\143\1\165\1\60\1"+
        "\141\1\157\1\145\1\164\2\60\1\137\1\164\2\162\1\143\1\60\2\145\1"+
        "\60\1\145\1\60\1\141\1\145\1\143\1\162\1\60\1\145\1\143\2\60\1\160"+
        "\1\141\3\60\1\163\1\60\1\145\1\60\1\144\1\141\1\162\1\163\1\164"+
        "\2\60\1\163\1\145\1\164\1\60\2\164\2\60\1\137\1\143\1\141\1\163"+
        "\1\164\1\60";
    static final String DFA20_maxS =
        "\1\176\1\57\1\171\1\72\1\uffff\1\165\1\170\1\156\1\145\1\167\1\171"+
        "\1\157\1\165\1\157\2\162\1\157\1\145\1\160\1\165\1\163\1\150\3\uffff"+
        "\1\172\1\154\1\156\1\164\1\155\1\164\1\163\1\165\1\154\1\50\1\164"+
        "\1\162\1\172\1\151\1\160\1\162\1\171\1\155\1\162\1\154\1\164\1\156"+
        "\1\164\1\141\1\151\1\154\1\162\1\145\1\164\1\167\1\155\1\145\1\157"+
        "\1\142\3\151\1\141\1\145\1\141\1\157\1\172\1\145\1\154\1\145\1\155"+
        "\2\151\1\165\1\172\1\164\1\165\1\145\1\164\1\145\1\163\1\157\1\172"+
        "\1\145\1\160\1\164\2\141\1\164\1\145\1\143\1\163\1\145\1\163\1\50"+
        "\1\141\1\157\1\172\1\145\1\162\1\166\1\164\1\154\1\157\1\156\1\154"+
        "\1\165\1\164\1\155\1\172\1\162\1\151\2\172\1\156\1\163\1\162\1\156"+
        "\1\151\1\143\1\157\1\143\1\156\1\172\1\167\1\172\1\154\1\165\1\164"+
        "\1\142\1\164\1\151\1\172\1\150\1\163\1\156\1\145\1\153\1\172\1\163"+
        "\2\141\1\145\1\151\1\156\1\147\1\145\1\154\1\145\1\151\1\156\1\143"+
        "\1\145\1\164\1\156\1\164\1\143\1\164\1\146\1\150\1\145\1\144\1\141"+
        "\1\172\2\141\1\151\1\154\1\172\1\156\2\172\1\144\2\172\1\160\2\164"+
        "\2\143\2\172\1\50\1\164\1\172\1\143\1\172\1\151\1\172\1\145\1\172"+
        "\1\145\3\172\1\50\1\146\1\172\1\155\1\164\2\154\1\145\1\143\1\165"+
        "\1\172\1\141\1\157\1\145\1\164\2\172\1\137\1\164\2\162\1\143\1\172"+
        "\2\145\1\172\1\145\1\172\1\141\1\145\1\143\1\162\1\172\1\145\1\143"+
        "\2\172\1\160\1\141\3\172\1\163\1\172\1\145\1\172\1\144\1\141\1\162"+
        "\1\163\1\164\2\172\1\163\1\145\1\164\1\172\2\164\2\172\1\137\1\143"+
        "\1\141\1\163\1\164\1\172";
    static final String DFA20_acceptS =
        "\4\uffff\1\1\21\uffff\1\2\1\3\1\4\u00ed\uffff";
    static final String DFA20_specialS =
        "\u0106\uffff}>";
    static final String[] DFA20_transitionS = {
            "\2\30\2\uffff\1\30\22\uffff\1\30\1\26\1\27\1\4\1\uffff\2\26"+
            "\1\27\1\26\1\4\5\26\1\1\12\27\1\3\5\26\1\uffff\32\27\1\26\1"+
            "\uffff\1\4\1\26\1\27\1\uffff\1\5\1\17\1\15\1\2\1\6\1\16\1\20"+
            "\1\27\1\7\3\27\1\14\1\21\1\22\1\23\1\27\1\10\1\11\1\12\1\24"+
            "\1\13\1\25\3\27\2\26\1\4\1\26",
            "\1\4\4\uffff\1\4",
            "\1\32\11\uffff\1\31\11\uffff\1\33",
            "\1\26",
            "",
            "\1\35\1\uffff\1\34",
            "\1\37\1\uffff\1\40\11\uffff\1\36",
            "\1\42\7\uffff\1\41",
            "\1\43",
            "\1\45\12\uffff\1\44\2\uffff\1\46",
            "\1\52\2\uffff\1\50\11\uffff\1\51\6\uffff\1\47",
            "\1\53\5\uffff\1\54",
            "\1\55",
            "\1\57\12\uffff\1\60\2\uffff\1\56",
            "\1\62\15\uffff\1\63\2\uffff\1\61",
            "\1\64",
            "\1\65",
            "\1\67\3\uffff\1\66",
            "\1\70",
            "\1\71\2\uffff\1\72",
            "\1\73\4\uffff\1\74",
            "\1\75",
            "",
            "",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\76\5\uffff\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\104\3\uffff\1\103",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\26\7\uffff\1\26",
            "\1\110\1\uffff\1\112\12\uffff\1\111",
            "\1\113\20\uffff\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120\10\uffff\1\121",
            "\1\123\3\uffff\1\122",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144\5\uffff\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\26\7\uffff\1\26",
            "\1\u0089",
            "\1\u008a",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u0096",
            "\1\u0097",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0\4\uffff\1\u00a1\4\uffff\1\u00a2",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00a3",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\12\27\7\uffff\32\27\4\uffff\1\u00cb\1\uffff\32\27",
            "\1\u00cc",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00cd",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\26\7\uffff\1\26",
            "\1\u00d3",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00d4",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00d5",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00d6",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00d7",
            "\12\27\7\uffff\32\27\4\uffff\1\u00d8\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\26\7\uffff\1\26",
            "\1\u00d9",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00ea",
            "\1\u00eb",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00ec",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00f1",
            "\1\u00f2",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00f3",
            "\1\u00f4",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00f5",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00f6",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00ff",
            "\1\u0100",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27"
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( IGNORE | OPERATOR | OPERAND | WS );";
        }
    }
 

}