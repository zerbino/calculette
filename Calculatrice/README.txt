README.txt

La grammaire de notre calculatrice correspond � la grammaire suivante :

MEMO ::= 'M'
RETOUR ::= 'R'
MODE ::= 'E'|'D'
FLOAT ::= ['0'..'9']* ',' ['0'..'9']
INT ::= ['0'..'9']+
OP ::= '*'|'-'|'/'|'+'

TermeBaseInt ::= INT | RETOUR
CalculInt ::= TermeBaseInt TermeBaseInt OP
TermeInt ::= CalculInt | TermeBaseInt  
CalculInt ::=  TermeInt TermeInt OP

TermeBaseDouble ::= FLOAT | RETOUR
CalculDouble ::= TermeBaseDouble TermeBaseDouble OP
TermeDouble ::= CalculDouble | TermeBaseDouble  
CalculDouble ::=  TermeDouble TermeDouble O

Calcul ::= CalculDouble | CalculInt
Memorisation ::= Calcul MEMO

Input ::= Calcul | MODE | Memorisation

Note : nous avons choisi de d�finir le symbole non terminal interm�diaire TermeInt pour
pr�ciser que le terme d'un calcul peut �tre � la fois un calcul ou un terme de base.
Il peut �tre tentant de simplifier cette grammaire en �crivant :

BaseInt ::= INT | RETOUR
CalculInt ::= BaseInt BaseInt OP | BaseInt
CalculInt ::= CalculInt CalculInt OP

Avec cette solution, un CalculInt peut �tre un simple Int. Cette solution compliquerait notre
programme, puisqu'il faudrait attendre de voir ce qui vient apr�s une premi�re entr�e de type
Int, pour savoir s'il faut recommencer un nouveau calcul ou non. 