%Metodo Newton
%09/09/2016
%Parametros de entrada
a=0.5;
b=0.75;
erro=5e-2;
cont=1;
xm=(b+a)/2;
xan=100*xm
while abs(xm-xan)>erro
    xan=xm;
    fxm=exp(-xm)-xm;
    fLxm=-exp(-xm)-1;
    xm=xm-(fxm/fLxm);
    cont=cont+1;
end