%parametros de entrada
x=[0,0.2,0.4]
y=[4,3.84,3.76]
n=2
X=0.1
%Corpo do programa
A=zeros(n+1)
for i=1:n+1
    A(:,i)=x.^(i-1);
end
B=y'
res=A\B
p_X=0
for i=1:n+1
    p_X=p_X+res(i)*(X.^(i-1))
end
disp(p_X)