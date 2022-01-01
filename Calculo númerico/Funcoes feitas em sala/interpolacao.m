%Parametros de Entrada------------------
x=[10:20] %Valor x da Tabela
y=[100:10:200] %Valor y da Tabela
X=14.3 %Valor que se deseja saber o valor da interpolaç~ao
n=2 % grau do polinomino iterpolador
%Corpo do Programa
delta=abs(x-X);
[valor, Col_maisProx]=sort(delta,2);
C=Col_maisProx(1:n+1);
[valor,C2]=sort(C,2)
C=C(C2)
x2=x(C)
y2=y(C)
