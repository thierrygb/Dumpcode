%----------NewtonAB----------
% Thalles Thayrone e Thirry Braga

erro = 1e-8;
selecao = 1; 
if selecao==1;
a=0.01;
b=1;   
xm=(b+a)/2;
xan=100*xm
while abs(xm-xan)>erro
    xan=xm;
    fxm=log(xm)+ 2*xm;
    fLxm=(1/xm)+ 2;
    xm=xm-(fxm/fLxm);
end

elseif selecao==2;
a=-4;
b=-3;   
xm=(b+a)/2;
xan=100*xm
while abs(xm-xan)>erro
    xan=xm;
    fxm=exp(xm)-sen(xm);
    fLxm= exp(xm)-cos(xm);
    xm=xm-(fxm/fLxm);
end

elseif selecao==3;
a=-2;
b=-1;   
xm=(b+a)/2;
xan=100*xm
while abs(xm-xan)>erro
    xan=xm;
    fxm=2*cos(xm)-(exp(xm)/2);
    fLxm= 2*sin(xm)-(exp(xm)/2);
    xm=xm-(fxm/fLxm);
end

else
a=4.5;
b=5.5;   
xm=(b+a)/2;
xan=100*xm
while abs(xm-xan)>erro
    xan=xm;
    fxm=(5-x)*exp(xm)-1;
    fLxm=-exp(x)*(x-4);
    xm=xm-(fxm/fLxm);
end
end


    