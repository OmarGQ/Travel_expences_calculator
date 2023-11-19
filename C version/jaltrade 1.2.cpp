#include <stdio.h> //Omar Ildefonso Godinez Q. 15300515
#include <windows.h>
    int finalhi=0, cat, des;
	char nombre[30], objetivo[100];

struct datos
{
	char pai[15], ciu[20], con[20];
	int hi, hachi, nen, shi, hachihi; 
	float trans, lavanderia;
}dat[2];

void cantidadeseste ()
{
   const int desayuno[4]={0,42,36,20}, comida[4]={0,62,59,42}, cena[4]={0,105,72,53}, hospedaje[4]={0,422,355,264};
   int f, asa, ban, hiru, hos=0;
   float totasa, totban, tothiru, tothos, total, dol; 
   FILE *fichero;
   char arc[30];
   asa=finalhi;
   ban=finalhi;
   hiru=finalhi;
   f=cat;
   if(dat[0].shi>900)
   {
   	asa--;
   }
   if(dat[0].shi>1400)
   {
   	ban--;
   }
   if(dat[0].shi>1900)
   {
   	hiru--;
   }
   if(dat[1].shi>=900)
   {
   	asa++;
   }
   if(dat[1].shi>=1400)
   {  
   ban++;
   }
   if(dat[1].shi>=1900)
   {
   	hiru++;
   }
   	if(dat[1].shi>=2200)
   	{
   		hos=1;
	}
   totasa=asa*desayuno[cat];
   totban=ban*comida[cat];
   tothiru=hiru*cena[cat];
   tothos=(finalhi+hos)*hospedaje[cat];
   total=totasa+totban+tothiru+tothos+dat[0].trans+dat[0].lavanderia;
   printf("\ncomo quiere que se llame el archivo en el que se guardara la informacion (inclulla la terminacion: .txt)\n");
   fflush(stdin);
   gets(arc);
   fichero = fopen( arc, "w+" );
   printf( "Fichero: %s -> ", nombre );
   if( fichero )
      printf( "creado (ABIERTO)\n" );
   else
   {
      printf( "Error (NO ABIERTO)\n" );
   }
   system("pause");
   system("cls");
   printf("%s \n",nombre);
   printf("%s\n", objetivo);
   printf("salida %i/%i/%i   regreso %i/%i/%i\n",dat[0].hi,dat[0].hachi,dat[0].nen,dat[1].hi,dat[1].hachi,dat[1].nen);
   printf("destino del viaje %s, %s, %s\n",dat[0].con,dat[0].pai,dat[0].ciu);
   printf("                    TABLA\n");
   printf("servicios	dinerop/dia	dias	total de viaje	\n");
   printf("-------------------------------------------------------\n");
   printf("desayuno: 	 %i	 	%i 	%2.2f\n",desayuno[cat], asa,totasa);
   printf("comida:     	 %i 		%i	%2.2f\n",comida[cat], ban,totban);
   printf("cena:     	 %i 		%i 	%2.2f\n",cena[cat], hiru,tothiru);
   printf("hospedaje:	 %i 		%i 	%2.2f\n",hospedaje[cat], finalhi,tothos);
   printf("\nEL TOTAL ES: %2.2f USD\n",total);
   fprintf(fichero, "%s \n",nombre);
   fprintf(fichero, "%s\n", objetivo);
   fprintf(fichero, "salida %i/%i/%i   regreso %i/%i/%i\n",dat[0].hi,dat[0].hachi,dat[0].nen,dat[1].hi,dat[1].hachi,dat[1].nen);
   fprintf(fichero, "destino del viaje %s, %s, %s\n",dat[0].con,dat[0].pai,dat[0].ciu);
   fprintf(fichero, "                      TABLA\n");
   fprintf(fichero, "servicios	dinerop/dia	dias	total de viaje	\n");
   fprintf(fichero, "-------------------------------------------------------\n");
   fprintf(fichero, "desayuno: 	 %i	 	%i 	%2.2f\n",desayuno[cat], asa,totasa);
   fprintf(fichero, "comida:     	 %i 		%i	%2.2f\n",comida[cat], ban,totban);
   fprintf(fichero, "cena:     	 %i 		%i 	%2.2f\n",cena[cat], hiru,tothiru);
   fprintf(fichero, "hospedaje:	 %i 		%i 	%2.2f\n",hospedaje[cat], finalhi,tothos);
   fprintf(fichero, "\nEL TOTAL ES: %2.2f USD\n",total);
   printf("ingrese el valor actual del dollar\n"),
   scanf("%f",&dol);
   total=total*dol;
   printf("\nEL TOTAL ES: %2.2f pesos\n",total);
   fprintf(fichero, "\nEL TOTAL ES: %2.2f pesos\n",total);   
   if( !fclose(fichero) )
      printf( "Fichero cerrado\n" );
   else
   {
      printf( "Error: fichero NO CERRADO\n" );
   }
   system("pause");
}

void cantidadesamerica ()
{
	int desayuno[4]={0,38,32,18}, comida[4]={0,56,53,38}, cena[4]={0,94,65,48}, hospedaje[4]={0,380,319,238};
	int f, asa, ban, hiru, hos=0;
   float totasa, totban, tothiru, tothos, total, dol; 
   FILE *fichero;
   char arc[30];
   asa=finalhi;
   ban=finalhi;
   hiru=finalhi;
   f=cat;
   if(dat[0].shi>900)
   {
   	asa--;
   }
   if(dat[0].shi>1400)
   {
   	ban--;
   }
   if(dat[0].shi>1900)
   {
   	hiru--;
   }
   if(dat[1].shi>=900)
   {
   	asa++;
   }
   if(dat[1].shi>=1400)
   {  
   ban++;
   }
   if(dat[1].shi>=1900)
   {
   	hiru++;
   }
   	if(dat[1].shi>=2200)
   	{
   		hos=1;
	}
   totasa=asa*desayuno[cat];
   totban=ban*comida[cat];
   tothiru=hiru*cena[cat];
   tothos=(finalhi+hos)*hospedaje[cat];
   total=totasa+totban+tothiru+tothos+dat[0].trans+dat[0].lavanderia;
   printf("\ncomo quiere que se llame el archivo en el que se guardara la informacion (inclulla la terminacion: .txt)\n");
   fflush(stdin);
   gets(arc);
   fichero = fopen( arc, "w+" );
   printf( "Fichero: %s -> ", nombre );
   if( fichero )
      printf( "creado (ABIERTO)\n" );
   else
   {
      printf( "Error (NO ABIERTO)\n" );
   }
   system("pause");
   system("cls");
   printf("%s \n",nombre);
   printf("%s\n", objetivo);
   printf("salida %i/%i/%i   regreso %i/%i/%i\n",dat[0].hi,dat[0].hachi,dat[0].nen,dat[1].hi,dat[1].hachi,dat[1].nen);
   printf("destino del viaje %s, %s\n",dat[0].pai,dat[0].ciu);
   printf("TABLA\n");
   printf("servicios	dinerop/dia	dias	total de viaje	\n");
   printf("-------------------------------------------------------\n");
   printf("desayuno: 	 %i	 	%i 	%2.2f\n",desayuno[cat], asa,totasa);
   printf("comida:     	 %i 		%i	%2.2f\n",comida[cat], ban,totban);
   printf("cena:     	 %i 		%i 	%2.2f\n",cena[cat], hiru,tothiru);
   printf("hospedaje:	 %i 		%i 	%2.2f\n",hospedaje[cat], finalhi,tothos);
   printf("\nEL TOTAL ES: %2.2f USD\n",total);
   fprintf(fichero, "%s \n",nombre);
   fprintf(fichero, "%s\n", objetivo);
   fprintf(fichero, "salida %i/%i/%i   regreso %i/%i/%i\n",dat[0].hi,dat[0].hachi,dat[0].nen,dat[1].hi,dat[1].hachi,dat[1].nen);
   fprintf(fichero, "destino del viaje %s, %s\n",dat[0].pai,dat[0].ciu);
   fprintf(fichero, "                      TABLA\n");
   fprintf(fichero, "servicios	dinerop/dia	dias	total de viaje	\n");
   fprintf(fichero, "-------------------------------------------------------\n");
   fprintf(fichero, "desayuno: 	 %i	 	%i 	%2.2f\n",desayuno[cat], asa,totasa);
   fprintf(fichero, "comida:     	 %i 		%i	%2.2f\n",comida[cat], ban,totban);
   fprintf(fichero, "cena:     	 %i 		%i 	%2.2f\n",cena[cat], hiru,tothiru);
   fprintf(fichero, "hospedaje:	 %i 		%i 	%2.2f\n",hospedaje[cat], finalhi,tothos);
   fprintf(fichero, "\nEL TOTAL ES: %2.2f USD\n",total);
   printf("ingrese el valor actual del dollar\n"),
   scanf("%f",&dol);
   total=total*dol;
   printf("\nEL TOTAL ES: %2.2f pesos\n",total);
   fprintf(fichero, "\nEL TOTAL ES: %2.2f pesos\n",total);   
   if( !fclose(fichero) )
      printf( "Fichero cerrado\n" );
   else
   {
      printf( "Error: fichero NO CERRADO\n" );
   }
   system("pause");
}

void cantidadesmexico()
{
	int desayuno[7]={0,137,128,92,220,166,128}, comida[7]={0,220,183,147,270,238,202}, cena[7]={0,137,128,92,220,166,128}, hospedaje[7]={0,1218,867,579,1515,1211,807};
	int f, asa, ban, hiru, hos=0, cont=0;
   float totasa, totban, tothiru, tothos, total, dol; 
   FILE *fichero;
   char arc[30];
   asa=finalhi;
   ban=finalhi;
   hiru=finalhi;
   f=cat;
   if(dat[0].shi>900)
   {
   	asa--;
   }
   if(dat[0].shi>1400)
   {
   	ban--;
   }
   if(dat[0].shi>1900)
   {
   	hiru--;
   }
   if(dat[1].shi>=900)
   {
   	asa++;
   }
   if(dat[1].shi>=1400)
   {  
   ban++;
   }
   if(dat[1].shi>=1900)
   {
   	hiru++;
   }
   	if(dat[1].shi>=2200)
   	{
   		hos=1;
	}
	cont=cat;
	if(des!=22)
	{
		cont+=3;
	}
   totasa=asa*desayuno[cont];
   totban=ban*comida[cont];
   tothiru=hiru*cena[cont];
   tothos=(finalhi+hos)*hospedaje[cont];
   total=totasa+totban+tothiru+tothos+dat[0].trans+dat[0].lavanderia;
   printf("\ncomo quiere que se llame el archivo en el que se guardara la informacion (inclulla la terminacion: .txt)\n");
   fflush(stdin);
   gets(arc);
   fichero = fopen( arc, "w+" );
   printf( "Fichero: %s -> ", nombre );
   if( fichero )
      printf( "creado (ABIERTO)\n" );
   else
   {
      printf( "Error (NO ABIERTO)\n" );
   }
   system("pause");
   system("cls");
   printf("%s \n",nombre);
   printf("%s\n", objetivo);
   printf("salida %i/%i/%i   regreso %i/%i/%i\n",dat[0].hi,dat[0].hachi,dat[0].nen,dat[1].hi,dat[1].hachi,dat[1].nen);
   printf("destino del viaje %s\n",dat[0].ciu);
   printf("                    TABLA\n");
   printf("servicios	dinerop/dia	dias	total de viaje	\n");
   printf("-------------------------------------------------------\n");
   printf("desayuno: 	 %i	 	%i 	%2.2f\n",desayuno[cont], asa,totasa);
   printf("comida:     	 %i 		%i	%2.2f\n",comida[cont], ban,totban);
   printf("cena:     	 %i 		%i 	%2.2f\n",cena[cont], hiru,tothiru);
   printf("hospedaje:	 %i 		%i 	%2.2f\n",hospedaje[cont], finalhi,tothos);
   printf("\nEL TOTAL ES: %2.2f pesos\n",total);
   fprintf(fichero, "%s \n",nombre);
   fprintf(fichero, "%s\n", objetivo);
   fprintf(fichero, "salida %i/%i/%i   regreso %i/%i/%i\n",dat[0].hi,dat[0].hachi,dat[0].nen,dat[1].hi,dat[1].hachi,dat[1].nen);
   fprintf(fichero, "destino del viaje %s\n",dat[0].ciu);
   fprintf(fichero, "                   TABLA\n");
   fprintf(fichero, "servicios	dinerop/dia	dias	total de viaje	\n");
   fprintf(fichero, "-------------------------------------------------------\n");
   fprintf(fichero, "desayuno: 	 %i	 	%i 	%2.2f\n",desayuno[cat], asa,totasa);
   fprintf(fichero, "comida:     	 %i 		%i	%2.2f\n",comida[cat], ban,totban);
   fprintf(fichero, "cena:     	 %i 		%i 	%2.2f\n",cena[cat], hiru,tothiru);
   fprintf(fichero, "hospedaje:	 %i 		%i 	%2.2f\n",hospedaje[cat], finalhi,tothos);
   fprintf(fichero, "\nEL TOTAL ES: %2.2f pesos\n",total);   
   if( !fclose(fichero) )
      printf( "Fichero cerrado\n" );
   else
   {
      printf( "Error: fichero NO CERRADO\n" );
   }
   system("pause");
}

void contador ()
{
	int ms, mr, an=0, hinen, i=0, bisiesto=0;
	an=dat[1].nen-dat[0].nen;//anos trascurridos
	for (i=dat[0].nen; i<=dat[1].nen; i++) 
    { 
        if ((i%4 == 0) && (i%100!=0 || i%400==0)) 
        { 
            bisiesto=bisiesto++; 
        } 
    } 
	hinen=(an*365)+bisiesto;//dias entre anos contando anos bisiestos
	switch (dat[0].hachi)//dias segun el mes
	{ 
case 1: ms=0; 
break; 
case 2: ms=31; 
break; 
case 3: ms=59; 
break; 
case 4: ms=90; 
break; 
case 5: ms=120; 
break; 
case 6: ms=151; 
break; 
case 7: ms=181; 
break; 
case 8: ms=212; 
break; 
case 9: ms=243; 
break; 
case 10: ms=273; 
break; 
case 11: ms=304; 
break; 
case 12: ms=334; 
break; 
    } 
    dat[0].hachihi=ms+dat[0].hi;//dias segun el mes mas los dias segun la salida
    switch (dat[1].hachi)
	{ 
case 1: mr=0; 
break; 
case 2: mr=31; 
break; 
case 3: mr=59; 
break; 
case 4: mr=90; 
break; 
case 5: mr=120; 
break; 
case 6: mr=151; 
break; 
case 7: mr=181; 
break; 
case 8: mr=212; 
break; 
case 9: mr=243; 
break; 
case 10: mr=273; 
break; 
case 11: mr=304; 
break; 
case 12: mr=334; 
break; 
    } 
    dat[1].hachihi=mr+dat[1].hi;//deias segun el mes mas los dias segun el regreso
    finalhi=dat[1].hachihi-dat[0].hachihi+hinen;
}

void mexico ()
{
	char loc, l;
	do
	{
	system ("cls");
	printf("si el destino es una de estas ciudades seleccionela: \n1-Ciudad de Mexico\n2-Esenda, Mexicali o Tijuana\n3-Cabo San Lucas o La Paz \n4-Campeche o Ciudad del Carmen\n5-Manzanillo");
	printf("\n6-Piedras Negras o Saltillo\n7-Tapachula o Tuxtla Gutierrez\n8-Ciudad, Juarez o Chihuahua\n9-Guanajuato o Leon\n10-Acapulco, Ixtapa o Zihuatanejo");
	printf("\n11-Toluca\n12-Monterrey\n13-huatulco\n14-Puebla\n15-Cancun, Conzumel o Chetumal\n16-Culiacan o Manzatlan\n17-Hermosillo o Nogales\n18-VillaHermosa");
	printf("\n19-Matamoros, Nuevo Laredo o Tampico\n20-Coatzacoalcos o Veracruz\n21-Puerto vallarta, Tomatlan, o San Sebastian del Oeste\n22-Otra ciudad\n");
	scanf("%i",&des);
    }while(des>22 || des==0);
		printf("cual es la ciudad destino\n");
		fflush(stdin);
		gets(dat[0].ciu);
	system("cls");
	do
	{
	if(finalhi<0)
	{
		system ("color f4");
		printf("fecha no congruente\n");
	    system ("color f0");
	}
	printf("a continuacion ingrese los datos de salida");
	printf("\ningrese el dia (ejemplo:8)\n");
	scanf("%i",&dat[0].hi);
	printf("ingrese el mes (ejemplo:2)\n");
	scanf("%i",&dat[0].hachi);
	printf("ingrese el ano\n");
	scanf("%i",&dat[0].nen);
	printf("ingrese la hora de salida (Ejempllo 1730)\n");
	scanf("%i",&dat[0].shi);
	system("cls");
	printf("a continuacion ingrese los datos de regreso");
	printf("\ningrese el dia (ejemplo:8)\n");
	scanf("%i",&dat[1].hi);
	printf("ingrese el mes (ejemplo:2)\n");
	scanf("%i",&dat[1].hachi);
	printf("ingrese el ano\n");
	scanf("%i",&dat[1].nen);
	printf("ingrese la hora del vuelo  (Ejempllo 1730)\n");
	scanf("%i",&dat[1].shi);
	system("cls");
	contador ();
    }while(finalhi<0);
    printf("necesita transporte local?\n");
	scanf("%s",&loc);
	if(loc=='s')
	{
		printf("cuanto dinero necesita? (pesos)\n");
		scanf("%f",&dat[0].trans);
	}
	if(finalhi>=8)
	{
		printf("requiere de lavanderia\n");
		scanf("%s",&l);
		if(l=='s')
		{
		    printf("ingrese la cantidad de dinero para lavanderia (pesos)\n");
		    scanf("%f",&dat[0].lavanderia);
	    }
	}
	cantidadesmexico ();
}

void america ()
{
	char loc, l;
	system ("cls");
	printf("cual es el pais destino:\n");
	fflush(stdin);
	gets(dat[0].pai);
	printf("cual es el estado o ciudad destino:\n");
    fflush(stdin);
	gets(dat[0].ciu);
	system("cls");
	do
	{
	if(finalhi<0)
	{
		system ("color f4");
		printf("fecha no congruente\n");
	    system ("color f0");
	}
	printf("a continuacion ingrese los datos de salida");
	printf("\ningrese el dia (ejemplo:8)\n");
	scanf("%i",&dat[0].hi);
	printf("ingrese el mes (ejemplo:2)\n");
	scanf("%i",&dat[0].hachi);
	printf("ingrese el ano\n");
	scanf("%i",&dat[0].nen);
	printf("ingrese la hora del vuelo  (Ejempllo 1730)\n");
	scanf("%i",&dat[0].shi);
	system("cls");
	printf("a continuacion ingrese los datos de regreso");
	printf("\ningrese el dia (ejemplo:8)\n");
	scanf("%i",&dat[1].hi);
	printf("ingrese el mes (ejemplo:2)\n");
	scanf("%i",&dat[1].hachi);
	printf("ingrese el ano\n");
	scanf("%i",&dat[1].nen);
	printf("ingrese la hora de salida (Ejempllo 1730)\n");
	scanf("%i",&dat[1].shi);
	system("cls");
	contador ();
	}while(finalhi<0);
	printf("necesita transporte local?\n");
	scanf("%s",&loc);
	if(loc=='s')
	{
		printf("cuanto dinero necesita? (USD)\n");
		scanf("%f",&dat[0].trans);
	}
	if(finalhi>=8)
	{
		printf("requiere de lavanderia?\n");
		scanf("%s",&l);
		if(l=='s')
		{
	         printf("ingrese la cantidad de dinero para lavanderia (USD)\n");
		     scanf("%f",&dat[0].lavanderia);
	   }
    }
    printf("%i",finalhi);
    cantidadesamerica ();
}

void este ()
{
	char loc, l;
	system("cls");
	printf("cual es el continente destino:\n");
	fflush(stdin);
	gets(dat[0].con);
	printf("cual es el pais destino:\n");
	fflush(stdin);
	gets(dat[0].pai);
	printf("cual es el estado o ciudad destino:\n");
	fflush(stdin);
	gets(dat[0].ciu);
	system("cls");
	do
	{
	if(finalhi<0)
	{
		system ("color f4");
		printf("fecha no congruente\n");
	    system ("color f0");
	}
    printf("a continuacion ingrese los datos de salida");
	printf("\ningrese el dia (ejemplo:8)\n");
	scanf("%i",&dat[0].hi);
	printf("ingrese el mes (ejemplo:2)\n");
	scanf("%i",&dat[0].hachi);
	printf("ingrese el ano\n");
	scanf("%i",&dat[0].nen);
	printf("ingrese la hora de salida (Ejempllo 1730)\n");
	scanf("%i",&dat[0].shi);
	system("cls");
	printf("a continuacion ingrese los datos de regreso");
	printf("\ningrese el dia(ejemplo:8)\n");
	scanf("%i",&dat[1].hi);
	printf("ingrese el mes(ejemplo:8)\n");
	scanf("%i",&dat[1].hachi);
	printf("ingrese el ano\n");
	scanf("%i",&dat[1].nen);
	printf("ingrese la hora del vuelo  (Ejempllo 1730)\n");
	scanf("%i",&dat[1].shi);
	system("cls");
	contador ();
	}while(finalhi<0);
	printf("necesita transporte local?\n");
	scanf("%s",&loc);
	if(loc=='s')
	{
		printf("cuanto dinero necesita? (USD)\n");
		scanf("%f",&dat[0].trans);
	}
	if(finalhi>=8)
	{
		printf("Requiere de lavanderia?\n");
		scanf("%s",&l);
		if(l=='s')
		{
		printf("ingrese la cantidad de dinero para lavanderia (USD)\n");
		scanf("%f",&dat[0].lavanderia);
	    }
	}
	cantidadeseste ();
}

void pais ()
{
	int m;
	printf("el viaje sera a: \n1-Mexico\n2-America\n3-Europa, Asia, Oceania o Africa\n");
	scanf("%i",&m);
	switch(m)
	{
		case 1:
			mexico ();
		break;
		case 2:
			america();
			break;
		case 3:
			este();
			break;
		default:
			printf("opcion no valida");
			system ("cls");
	}
}

int main()
{
	char opcion, y;
	system ("color f3");
	printf("\n		 __________________________");
	printf("\n		|                          |");
	printf("\n		| BIENVENIDO AL CALCULADOR |");
	printf("\n		| DE VIATICOS DE JALTRADE  |");
	printf("\n		|__________________________|\n\n\n");
	system("pause");
	system("cls");
	system ("color f0");
	do
	{
	printf("ingrese el nombre del sevidor publico: \n");
	fflush(stdin);
	gets(nombre);
	system("cls");
	do
	{
	printf("cual es el nivel del servidor:\n1-Secretario y/o Homologos\n2-Subsecretario, Director, general o equivalente\n3-Director, Jefe de departamento y resto de categorias\n");
	scanf("%i",&cat);
	system("cls");
    }while(cat>3 || cat==0);
    printf("Va a acompanar a un superior?:\n");
    scanf("%s",&y);
    if(y=='s')
    {
    	do
    	{
    	printf("cual es su nivel\n1-Secretario y/o Homologos\n2-Subsecretario, Director\n");
    	scanf("%i",&cat);
    	system ("cls");
        }while(cat>2 && cat==0);
	}
	system ("cls");
	printf("cual es el objetivo del viaje:\n");
	fflush(stdin);
	gets(objetivo);
	system ("cls");
	pais ();
	system("cls");
	printf("QUIERE REPETIR EL PROCESO:");
	scanf("%s",&opcion);
    }while(opcion=='s');
    return 0;
}
