%Metodo Bisseccao-Versao2, com maior eficiencia computacional.
%09/09/2016
%Parametros de entrada
a=0.5;
b=0.75;
erro=5e-2;
cont=1;
xm=(b+a)/2;
fa=1;%valor inicial qualquer, nao tem influencia no programa
fxm=1;%valor inicial qualquer, nao tem influencia no programa
while (b-a)>erro
    if cont==1 | fxm*fa>0
        fa=exp(-a)-a;
    end
    fxm=exp(-xm)-xm;
    if fxm*fa<0
        b=xm;
    else
        a=xm;
    end
    xm=(b+a)/2;
    cont=cont+1;
end