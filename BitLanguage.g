grammar BitLanguage;

options {
	output = AST;	
	ASTLabelType=CommonTree;
}

tokens{
	PROG;VAR;DECL;IFSTMT;WHILESTMT;DECLSTMT;STMTLIST
	;STMT;COMPSMTM;RETURNSTMT;EXP;EXPSTMT;SIMEXP;
	RELOP;ADDEXP;ADDOP;TERM;MULOP;FACTOR;
}

@header {
	package bitwars;
}
@lexer::header{
	package bitwars;
}


program : 
statement_list ->^(PROG statement_list)
;catch[RecognitionException re]{
	throw re;
}
statement_list : 
statement+ ->^(STMTLIST statement+)
;catch[RecognitionException re]{
	throw re;
}
statement : 
declaration_stmt ->^(STMT declaration_stmt)
| expression_stmt ->^(STMT expression_stmt)
| compound_stmt ->^(STMT compound_stmt)
| if_stmt ->^(STMT if_stmt)
| iteration_stmt ->^(STMT iteration_stmt)
| return_stmt ->^(STMT return_stmt)
;catch[RecognitionException re]{
	throw re;
}
declaration_stmt :
declaration+  ->^(DECLSTMT declaration+)
;catch[RecognitionException re]{
	throw re;
}
declaration : 
'int'ID('='additive_expression)?';' 
->^(DECL 'int'ID('='additive_expression)?';') 
| 'int'ID'['NUM']'('=''{'(additive_expression',')*'}')?';' 
->^(DECL 'int'ID'['NUM']'('=''{'(additive_expression',')*'}')?';')
;catch[RecognitionException re]{
	throw re;
}
compound_stmt : 
'{'statement_list'}' ->^(COMPSMTM '{'statement_list'}')
;catch[RecognitionException re]{
	throw re;
}
if_stmt : 
'if''('simple_expression')'statement('else'statement)? ->^(IFSTMT 'if''('simple_expression')'statement('else'statement)?)
;catch[RecognitionException re]{
	throw re;
}
iteration_stmt : 
'while''('simple_expression')'statement ->^(WHILESTMT 'while''('simple_expression')'statement)
;catch[RecognitionException re]{
	throw re;
}
return_stmt : 
'return'simple_expression';' ->^(RETURNSTMT 'return'simple_expression';')
;catch[RecognitionException re]{
	throw re;
}
expression_stmt : 
expression ->^(EXPSTMT expression)
;catch[RecognitionException re]{
	throw re;
}
expression : 
var'='simple_expression';'  ->^(EXP var'='simple_expression';')
;catch[RecognitionException re]{
	throw re;
}
var : 
ID('['additive_expression']')? ->^(VAR ID('['additive_expression']')?)
;catch[RecognitionException re]{
	throw re;
}
simple_expression : 
additive_expression (relop additive_expression)? ->^(SIMEXP additive_expression (relop additive_expression)?)
;catch[RecognitionException re]{
	throw re;
}
relop : 
'<' ->^(RELOP '<')
| '<=' ->^(RELOP '<=')
| '>' ->^(RELOP '>')
| '>=' ->^(RELOP '>=')
| '==' ->^(RELOP '==')
| '!=' ->^(RELOP '!=')
| '&&' ->^(RELOP '&&')
| '||' ->^(RELOP '||')
;catch[RecognitionException re]{
	throw re;
}
additive_expression : 
term (addop term)* ->^(ADDEXP term (addop term)*)
;catch[RecognitionException re]{
	throw re;
}
addop : 
'+' ->^(ADDOP '+')
| '-' ->^(ADDOP '-')
;catch[RecognitionException re]{
	throw re;
}
term : 
factor(mulop factor)* ->^(TERM factor(mulop factor)*)
;catch[RecognitionException re]{
	throw re;
}
mulop :	
'*' ->^(MULOP '*')
| '/' ->^(MULOP '/')
| '%'->^(MULOP '%')
;catch[RecognitionException re]{
	throw re;
}
factor : 
'('simple_expression')' ->^(FACTOR '('simple_expression')')
| var ->^(FACTOR var)
| 'RANDOM''('simple_expression')' ->^(FACTOR 'RANDOM''('simple_expression')')
| NUM ->^(FACTOR NUM)
;catch[RecognitionException re]{
	throw re;
}


REWORD : ('if' | 'else' | 'where' | 'return' | 'int');
ID : ('a'..'z' |'A'..'Z')+ ;
NUM : '0'..'9'+ ;
WS : (' ' |'\t' |'\n' |'\r' )+ {skip();} ;