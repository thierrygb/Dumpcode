%Parametros de Entrada-------------------
x=[10:20] %Valor x da Tabela
y=[100:10:200]%Valor y da Tabela
X=14.3 %Valor que se deseja saber o valor da interpolação
n=2 % grau do polinômio interpolador
%Corpo do Progama-------------------------
delta=abs(x-X);
[valor,Col_mais_Prox]=sort(delta,2);
C=Col_mais_Prox(1:n+1);
[valor,C2]=sort(C,2)
C=C(C2)
x2=x(C)
y2=y(C)