%Interativo
%Feita em sala, aula ministrada em 02/09/2016
x=[0,0,0]
A=[5,1,1;2,4,1;1,1,3]
B=[4;1;-2]
erroD=0.01
for i=1:10^10
    xant=x;
    x(1)=(1/A(1,1))*(B(1)-A(1,2)*xant(2)-A(1,3)*xant(3));
    x(2)=(1/A(2,2))*(B(2)-A(2,1)*xant(1)-A(2,3)*xant(3));
    x(3)=(1/A(3,3))*(B(3)-A(3,1)*xant(1)-A(3,2)*xant(2));
    erro1= abs(x-xant);
    erro2=max(erro1,[],2);
    if erro2<=erroD
        break
    end
end
