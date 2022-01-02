%Ajuste de Curvas AB

x=[0.1, 0.2, 0.5, 0.65, 0.7, 0.8, 0.9, 1.1, 1.23, 1.35, 1.57, 1.7, 1.75, 1.8, 1.94];
f=[0.19, 0.36, 0.75, 0.87, 0.91, 0.96, 0.99, 0.99, 0.94, 0.87, 0.67, 0.51, 0.43, 0.36, 0.11];

x2=[0:0.01:2];

g1= 1;
g2= x;
g3= x.^2;
g4= x.^3;

a11=sum(g1.*g1);
a12=sum(g1.*g2);
a13=sum(g1.*g3);
a14=sum(g1.*g4);
a21=sum(g2.*g1);
a22=sum(g2.*g2);
a23=sum(g2.*g3);
a24=sum(g2.*g4);
a31=sum(g3.*g1);
a32=sum(g3.*g2);
a33=sum(g3.*g3);
a34=sum(g3.*g4);
a41=sum(g4.*g1);
a42=sum(g4.*g2);
a43=sum(g4.*g3);
a44=sum(g4.*g4);

b1=sum(f.*g1);
b2=sum(f.*g2);
b3=sum(f.*g3);
b4=sum(f.*g4);

a=[a11 a12 a13 a14;a21 a22 a23 a24;a31 a32 a33 a34;a41 a42 a43 a44];
b=[b1; b2; b3; b4];

alpha= a\b;
disp(alpha);


phi=alpha(1)*x+alpha(2)*g2+alpha(3)*g3+alpha(4)*g4;

d=sum((f - phi).^2);

disp(d);

phi2=alpha(1)*1 + alpha(2)*x2 + alpha(3)*x2.^2 + alpha(4)*x2.^3;

plot(x2, phi2, 'r-');
hold on; 

plot(x,f,'ko');