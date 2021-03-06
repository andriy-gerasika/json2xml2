// $ANTLR 3.3 Nov 30, 2010 12:45:30 /home/andriy/Projects.git/json2xml2/src/org/xerial/json/impl/JSON.g 2012-10-18 02:30:56

// AUTOGENERATED BY ANTLR!!! DO NOT MODIFY!!!

//--------------------------------------
// Xerial Project
//
// JSONParser.java
// Since: Apr 26, 2007
//
//--------------------------------------
package org.xerial.json.impl;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class JSONParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "XML_ELEMENT", "XML_ATTRIBUTE", "Dot", "NULL", "Digit", "HexDigit", "UnicodeChar", "EscapeSequence", "StringChar", "Int", "Frac", "Exp", "WhiteSpace", "String", "Integer", "Double", "Boolean", "'{'", "','", "'}'", "':'", "'['", "']'"
    };
    public static final int EOF=-1;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int XML_ELEMENT=4;
    public static final int XML_ATTRIBUTE=5;
    public static final int Dot=6;
    public static final int NULL=7;
    public static final int Digit=8;
    public static final int HexDigit=9;
    public static final int UnicodeChar=10;
    public static final int EscapeSequence=11;
    public static final int StringChar=12;
    public static final int Int=13;
    public static final int Frac=14;
    public static final int Exp=15;
    public static final int WhiteSpace=16;
    public static final int String=17;
    public static final int Integer=18;
    public static final int Double=19;
    public static final int Boolean=20;

    // delegates
    // delegators


        public JSONParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public JSONParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return JSONParser.tokenNames; }
    public String getGrammarFileName() { return "/home/andriy/Projects.git/json2xml2/src/org/xerial/json/impl/JSON.g"; }


    public static class json_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "json"
    // /home/andriy/Projects.git/json2xml2/src/org/xerial/json/impl/JSON.g:102:1: json : value -> ^( XML_ELEMENT[\"json\"] value ) ;
    public final JSONParser.json_return json() throws RecognitionException {
        JSONParser.json_return retval = new JSONParser.json_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        JSONParser.value_return value1 = null;


        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        try {
            // /home/andriy/Projects.git/json2xml2/src/org/xerial/json/impl/JSON.g:103:2: ( value -> ^( XML_ELEMENT[\"json\"] value ) )
            // /home/andriy/Projects.git/json2xml2/src/org/xerial/json/impl/JSON.g:103:4: value
            {
            pushFollow(FOLLOW_value_in_json409);
            value1=value();

            state._fsp--;

            stream_value.add(value1.getTree());


            // AST REWRITE
            // elements: value
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 103:10: -> ^( XML_ELEMENT[\"json\"] value )
            {
                // /home/andriy/Projects.git/json2xml2/src/org/xerial/json/impl/JSON.g:103:13: ^( XML_ELEMENT[\"json\"] value )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XML_ELEMENT, "json"), root_1);

                adaptor.addChild(root_1, stream_value.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "json"

    public static class object_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "object"
    // /home/andriy/Projects.git/json2xml2/src/org/xerial/json/impl/JSON.g:106:1: object : '{' ( element ( ',' element )* )? '}' -> ^( XML_ELEMENT[\"object\"] ( element )* ) ;
    public final JSONParser.object_return object() throws RecognitionException {
        JSONParser.object_return retval = new JSONParser.object_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal2=null;
        Token char_literal4=null;
        Token char_literal6=null;
        JSONParser.element_return element3 = null;

        JSONParser.element_return element5 = null;


        Object char_literal2_tree=null;
        Object char_literal4_tree=null;
        Object char_literal6_tree=null;
        RewriteRuleTokenStream stream_21=new RewriteRuleTokenStream(adaptor,"token 21");
        RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
        RewriteRuleSubtreeStream stream_element=new RewriteRuleSubtreeStream(adaptor,"rule element");
        try {
            // /home/andriy/Projects.git/json2xml2/src/org/xerial/json/impl/JSON.g:107:2: ( '{' ( element ( ',' element )* )? '}' -> ^( XML_ELEMENT[\"object\"] ( element )* ) )
            // /home/andriy/Projects.git/json2xml2/src/org/xerial/json/impl/JSON.g:107:4: '{' ( element ( ',' element )* )? '}'
            {
            char_literal2=(Token)match(input,21,FOLLOW_21_in_object429);  
            stream_21.add(char_literal2);

            // /home/andriy/Projects.git/json2xml2/src/org/xerial/json/impl/JSON.g:107:8: ( element ( ',' element )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==String) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/andriy/Projects.git/json2xml2/src/org/xerial/json/impl/JSON.g:107:9: element ( ',' element )*
                    {
                    pushFollow(FOLLOW_element_in_object432);
                    element3=element();

                    state._fsp--;

                    stream_element.add(element3.getTree());
                    // /home/andriy/Projects.git/json2xml2/src/org/xerial/json/impl/JSON.g:107:17: ( ',' element )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==22) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // /home/andriy/Projects.git/json2xml2/src/org/xerial/json/impl/JSON.g:107:18: ',' element
                    	    {
                    	    char_literal4=(Token)match(input,22,FOLLOW_22_in_object435);  
                    	    stream_22.add(char_literal4);

                    	    pushFollow(FOLLOW_element_in_object437);
                    	    element5=element();

                    	    state._fsp--;

                    	    stream_element.add(element5.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal6=(Token)match(input,23,FOLLOW_23_in_object443);  
            stream_23.add(char_literal6);



            // AST REWRITE
            // elements: element
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 108:4: -> ^( XML_ELEMENT[\"object\"] ( element )* )
            {
                // /home/andriy/Projects.git/json2xml2/src/org/xerial/json/impl/JSON.g:108:7: ^( XML_ELEMENT[\"object\"] ( element )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XML_ELEMENT, "object"), root_1);

                // /home/andriy/Projects.git/json2xml2/src/org/xerial/json/impl/JSON.g:108:31: ( element )*
                while ( stream_element.hasNext() ) {
                    adaptor.addChild(root_1, stream_element.nextTree());

                }
                stream_element.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "object"

    public static class element_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "element"
    // /home/andriy/Projects.git/json2xml2/src/org/xerial/json/impl/JSON.g:111:1: element : String ':' value -> ^( XML_ELEMENT[\"element\"] ^( XML_ATTRIBUTE[\"name\"] String ) value ) ;
    public final JSONParser.element_return element() throws RecognitionException {
        JSONParser.element_return retval = new JSONParser.element_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token String7=null;
        Token char_literal8=null;
        JSONParser.value_return value9 = null;


        Object String7_tree=null;
        Object char_literal8_tree=null;
        RewriteRuleTokenStream stream_String=new RewriteRuleTokenStream(adaptor,"token String");
        RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        try {
            // /home/andriy/Projects.git/json2xml2/src/org/xerial/json/impl/JSON.g:112:2: ( String ':' value -> ^( XML_ELEMENT[\"element\"] ^( XML_ATTRIBUTE[\"name\"] String ) value ) )
            // /home/andriy/Projects.git/json2xml2/src/org/xerial/json/impl/JSON.g:112:4: String ':' value
            {
            String7=(Token)match(input,String,FOLLOW_String_in_element468);  
            stream_String.add(String7);

            char_literal8=(Token)match(input,24,FOLLOW_24_in_element470);  
            stream_24.add(char_literal8);

            pushFollow(FOLLOW_value_in_element472);
            value9=value();

            state._fsp--;

            stream_value.add(value9.getTree());


            // AST REWRITE
            // elements: String, value
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 113:4: -> ^( XML_ELEMENT[\"element\"] ^( XML_ATTRIBUTE[\"name\"] String ) value )
            {
                // /home/andriy/Projects.git/json2xml2/src/org/xerial/json/impl/JSON.g:113:7: ^( XML_ELEMENT[\"element\"] ^( XML_ATTRIBUTE[\"name\"] String ) value )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XML_ELEMENT, "element"), root_1);

                // /home/andriy/Projects.git/json2xml2/src/org/xerial/json/impl/JSON.g:113:32: ^( XML_ATTRIBUTE[\"name\"] String )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(XML_ATTRIBUTE, "name"), root_2);

                adaptor.addChild(root_2, stream_String.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_value.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "element"

    public static class array_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "array"
    // /home/andriy/Projects.git/json2xml2/src/org/xerial/json/impl/JSON.g:116:1: array : '[' value ( ',' value )* ']' -> ^( XML_ELEMENT[\"array\"] ( value )+ ) ;
    public final JSONParser.array_return array() throws RecognitionException {
        JSONParser.array_return retval = new JSONParser.array_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal10=null;
        Token char_literal12=null;
        Token char_literal14=null;
        JSONParser.value_return value11 = null;

        JSONParser.value_return value13 = null;


        Object char_literal10_tree=null;
        Object char_literal12_tree=null;
        Object char_literal14_tree=null;
        RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        try {
            // /home/andriy/Projects.git/json2xml2/src/org/xerial/json/impl/JSON.g:117:2: ( '[' value ( ',' value )* ']' -> ^( XML_ELEMENT[\"array\"] ( value )+ ) )
            // /home/andriy/Projects.git/json2xml2/src/org/xerial/json/impl/JSON.g:117:4: '[' value ( ',' value )* ']'
            {
            char_literal10=(Token)match(input,25,FOLLOW_25_in_array504);  
            stream_25.add(char_literal10);

            pushFollow(FOLLOW_value_in_array506);
            value11=value();

            state._fsp--;

            stream_value.add(value11.getTree());
            // /home/andriy/Projects.git/json2xml2/src/org/xerial/json/impl/JSON.g:117:14: ( ',' value )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==22) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/andriy/Projects.git/json2xml2/src/org/xerial/json/impl/JSON.g:117:15: ',' value
            	    {
            	    char_literal12=(Token)match(input,22,FOLLOW_22_in_array509);  
            	    stream_22.add(char_literal12);

            	    pushFollow(FOLLOW_value_in_array511);
            	    value13=value();

            	    state._fsp--;

            	    stream_value.add(value13.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            char_literal14=(Token)match(input,26,FOLLOW_26_in_array515);  
            stream_26.add(char_literal14);



            // AST REWRITE
            // elements: value
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 118:4: -> ^( XML_ELEMENT[\"array\"] ( value )+ )
            {
                // /home/andriy/Projects.git/json2xml2/src/org/xerial/json/impl/JSON.g:118:7: ^( XML_ELEMENT[\"array\"] ( value )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XML_ELEMENT, "array"), root_1);

                if ( !(stream_value.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_value.hasNext() ) {
                    adaptor.addChild(root_1, stream_value.nextTree());

                }
                stream_value.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "array"

    public static class value_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "value"
    // /home/andriy/Projects.git/json2xml2/src/org/xerial/json/impl/JSON.g:122:1: value : ( String -> ^( XML_ELEMENT[\"string\"] String ) | Integer -> ^( XML_ELEMENT[\"integer\"] Integer ) | Double -> ^( XML_ELEMENT[\"double\"] Double ) | Boolean -> ^( XML_ELEMENT[\"boolean\"] Boolean ) | object | array | NULL );
    public final JSONParser.value_return value() throws RecognitionException {
        JSONParser.value_return retval = new JSONParser.value_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token String15=null;
        Token Integer16=null;
        Token Double17=null;
        Token Boolean18=null;
        Token NULL21=null;
        JSONParser.object_return object19 = null;

        JSONParser.array_return array20 = null;


        Object String15_tree=null;
        Object Integer16_tree=null;
        Object Double17_tree=null;
        Object Boolean18_tree=null;
        Object NULL21_tree=null;
        RewriteRuleTokenStream stream_Double=new RewriteRuleTokenStream(adaptor,"token Double");
        RewriteRuleTokenStream stream_String=new RewriteRuleTokenStream(adaptor,"token String");
        RewriteRuleTokenStream stream_Boolean=new RewriteRuleTokenStream(adaptor,"token Boolean");
        RewriteRuleTokenStream stream_Integer=new RewriteRuleTokenStream(adaptor,"token Integer");

        try {
            // /home/andriy/Projects.git/json2xml2/src/org/xerial/json/impl/JSON.g:123:2: ( String -> ^( XML_ELEMENT[\"string\"] String ) | Integer -> ^( XML_ELEMENT[\"integer\"] Integer ) | Double -> ^( XML_ELEMENT[\"double\"] Double ) | Boolean -> ^( XML_ELEMENT[\"boolean\"] Boolean ) | object | array | NULL )
            int alt4=7;
            switch ( input.LA(1) ) {
            case String:
                {
                alt4=1;
                }
                break;
            case Integer:
                {
                alt4=2;
                }
                break;
            case Double:
                {
                alt4=3;
                }
                break;
            case Boolean:
                {
                alt4=4;
                }
                break;
            case 21:
                {
                alt4=5;
                }
                break;
            case 25:
                {
                alt4=6;
                }
                break;
            case NULL:
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // /home/andriy/Projects.git/json2xml2/src/org/xerial/json/impl/JSON.g:123:4: String
                    {
                    String15=(Token)match(input,String,FOLLOW_String_in_value541);  
                    stream_String.add(String15);



                    // AST REWRITE
                    // elements: String
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 123:11: -> ^( XML_ELEMENT[\"string\"] String )
                    {
                        // /home/andriy/Projects.git/json2xml2/src/org/xerial/json/impl/JSON.g:123:14: ^( XML_ELEMENT[\"string\"] String )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XML_ELEMENT, "string"), root_1);

                        adaptor.addChild(root_1, stream_String.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/andriy/Projects.git/json2xml2/src/org/xerial/json/impl/JSON.g:124:4: Integer
                    {
                    Integer16=(Token)match(input,Integer,FOLLOW_Integer_in_value555);  
                    stream_Integer.add(Integer16);



                    // AST REWRITE
                    // elements: Integer
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 124:12: -> ^( XML_ELEMENT[\"integer\"] Integer )
                    {
                        // /home/andriy/Projects.git/json2xml2/src/org/xerial/json/impl/JSON.g:124:15: ^( XML_ELEMENT[\"integer\"] Integer )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XML_ELEMENT, "integer"), root_1);

                        adaptor.addChild(root_1, stream_Integer.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /home/andriy/Projects.git/json2xml2/src/org/xerial/json/impl/JSON.g:125:4: Double
                    {
                    Double17=(Token)match(input,Double,FOLLOW_Double_in_value569);  
                    stream_Double.add(Double17);



                    // AST REWRITE
                    // elements: Double
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 125:11: -> ^( XML_ELEMENT[\"double\"] Double )
                    {
                        // /home/andriy/Projects.git/json2xml2/src/org/xerial/json/impl/JSON.g:125:14: ^( XML_ELEMENT[\"double\"] Double )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XML_ELEMENT, "double"), root_1);

                        adaptor.addChild(root_1, stream_Double.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /home/andriy/Projects.git/json2xml2/src/org/xerial/json/impl/JSON.g:126:4: Boolean
                    {
                    Boolean18=(Token)match(input,Boolean,FOLLOW_Boolean_in_value583);  
                    stream_Boolean.add(Boolean18);



                    // AST REWRITE
                    // elements: Boolean
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 126:12: -> ^( XML_ELEMENT[\"boolean\"] Boolean )
                    {
                        // /home/andriy/Projects.git/json2xml2/src/org/xerial/json/impl/JSON.g:126:15: ^( XML_ELEMENT[\"boolean\"] Boolean )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XML_ELEMENT, "boolean"), root_1);

                        adaptor.addChild(root_1, stream_Boolean.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // /home/andriy/Projects.git/json2xml2/src/org/xerial/json/impl/JSON.g:127:4: object
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_object_in_value597);
                    object19=object();

                    state._fsp--;

                    adaptor.addChild(root_0, object19.getTree());

                    }
                    break;
                case 6 :
                    // /home/andriy/Projects.git/json2xml2/src/org/xerial/json/impl/JSON.g:128:4: array
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_array_in_value604);
                    array20=array();

                    state._fsp--;

                    adaptor.addChild(root_0, array20.getTree());

                    }
                    break;
                case 7 :
                    // /home/andriy/Projects.git/json2xml2/src/org/xerial/json/impl/JSON.g:129:4: NULL
                    {
                    root_0 = (Object)adaptor.nil();

                    NULL21=(Token)match(input,NULL,FOLLOW_NULL_in_value611); 
                    NULL21_tree = (Object)adaptor.create(NULL21);
                    adaptor.addChild(root_0, NULL21_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "value"

    // Delegated rules


 

    public static final BitSet FOLLOW_value_in_json409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_object429 = new BitSet(new long[]{0x0000000000820000L});
    public static final BitSet FOLLOW_element_in_object432 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_object435 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_element_in_object437 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_object443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_String_in_element468 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_element470 = new BitSet(new long[]{0x00000000023E0080L});
    public static final BitSet FOLLOW_value_in_element472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_array504 = new BitSet(new long[]{0x00000000023E0080L});
    public static final BitSet FOLLOW_value_in_array506 = new BitSet(new long[]{0x0000000004400000L});
    public static final BitSet FOLLOW_22_in_array509 = new BitSet(new long[]{0x00000000023E0080L});
    public static final BitSet FOLLOW_value_in_array511 = new BitSet(new long[]{0x0000000004400000L});
    public static final BitSet FOLLOW_26_in_array515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_String_in_value541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Integer_in_value555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Double_in_value569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Boolean_in_value583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_in_value597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_in_value604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_value611 = new BitSet(new long[]{0x0000000000000002L});

}