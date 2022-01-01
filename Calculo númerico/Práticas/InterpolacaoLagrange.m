%----------Implementacao de Lagrange----------

X = 0.3                 %Ponto de interpolacao
x = [0,0.2,0.4]         %Valores de x na tabela
f = [4,3.84,3.76]       %Valores de y na tabela

n = 2                   %Grau do polinomino

%Definir o numero de colunas
 
 nc = size(x,2)
  if n >= nc
    error('Digite um valor de n+1')
      elseif (n + 1) > nc
       funcaoX
      
      
      acumuladorS = 0
        for k = 1: n +1
          acumuladorP = 1
            for i : n +1
              if i =~ k 
                acumuladorP = acumuladorP*(X-x(1))/(Xk - X1) 
      
