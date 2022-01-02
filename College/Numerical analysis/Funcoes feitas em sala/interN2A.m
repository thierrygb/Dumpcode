%parametros de entrada
x=[1.25,2.51]
y=[0.34,0.9]
%Corpo do programa
A=zeros(2)
A(:,1)=x.^0;
A(:,2)=x.^1;
B=y'
res=A\B