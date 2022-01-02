%----------BisseccaoAB----------
% Thalles Thayrone e Thirry Braga

erro = 1e-8;
selecao = 2; 
if selecao==1
a = 0.01;
b = 1;
x = (a + b)/2;
fa = 0.01;
fx = 1;

  while (b - a) > erro
    
    fa=log(a) + 2*a;
    fx=log(x) + 2*x;
     if fx*fa > 0
    a= x;
    else
    b= x;
    end
        x=(a+b)/2;
  end
elseif selecao==2
a = -4;
b = 2;
x = (a + b)/2;
fa = -4;
fx = 2;

  while (b - a) > erro
    
    fa=exp(a)+ sin(a);
    fx=exp(x)+ sin(x);
     if fx*fa > 0
    a= x;
    else
    b= x;
    end
        x=(a+b)/2;
      end
elseif selecao==3
a = -2;
b = 1;
x = (a + b)/2;
fa = -2;
fx = 1;

  while (b - a) > erro
    
    fa=2*cos(a)+ (exp(a)/2);
    fx=2*cos(x)+ (exp(x)/2);
     if fx*fa > 0
    a= x;
    else
    b= x;
    end
        x=(a+b)/2;
      end
else
a = -2;
b = 1;
x = (a + b)/2;
fa = -2;
fx = 1;

  while (b - a) > erro
    
    fa=(5-a)*exp(a)-1;
    fx=(5-x)*exp(x)-1;
     if fx*fa > 0
    a= x;
    else
    b= x;
    end
        x=(a+b)/2;
      end
end


