%Metodo Bisseccao
%09/09/2016
%Parametros de entrada
a=0.5;
b=0.75;
erro=5e-2;
cont=1;
xm=(b+a)/2;
while (b-a)>erro
    fxm=exp(-xm)-xm;
    fa=exp(-a)-a;
    if fxm*fa<0
        b=xm
    else
        a=xm
    end
    xm=(b+a)/2;
    cont=cont+1;
end