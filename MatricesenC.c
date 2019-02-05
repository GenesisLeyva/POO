#include <stdio.h>
#include <time.h>
#define R 100
#define C 100

//Funciones prototipo
void Inicializar_M(int matriz[R][C],int ren,int col);
void imprimir_M(int matriz[R][C],int ren,int col);
void transpuesta_M(int matriz[R][C],int M_trans[R][C],int ren, int col);
int validarCuadratura(int ren1,int ren2, int col1,int col2);
int ValidarMulti(int col1,int ren2);
void sumar_M(int M1[R][C],int M2[R][C],int M_suma[R][C],int ren, int col);
void restar_M(int M1[R][C],int M2[R][C],int M_suma[R][C],int ren, int col);
void multiplicar_M(int M1[R][C],int M2[R][C],int M_multi[R][C],int ren, int col,int col2);


int main(){

srand(time(NULL));

int ren1,ren2,col1,col2;
printf("Capture los datos de la Matriz 1: ");
printf("\nRenglones: ");
scanf("%d",&ren1);
printf("\nColumnas: ");
scanf("%d",&col1);
printf("Capture los datos de la Matriz 2: ");
printf("\nRenglones: ");
scanf("%d",&ren2);
printf("\nColumnas: ");
scanf("%d",&col2);

int M1[ren1][col1];
int M2[ren2][col2];
int M_trans[R][C];
int M_suma[R][C];
int M_resta[R][C];
int M_multi[R][C]={0};

//Inicializar e imprimir matriz1
Inicializar_M(M1,ren1,col1);
printf("\nMatriz1: \n");
imprimir_M(M1,ren1,col1);
//Inicializar e imprimir matriz2
Inicializar_M(M2,ren2,col2);
printf("\nMatriz2: \n");
imprimir_M(M2,ren2,col2);

//Transpuesta de M1y M2
transpuesta_M(M1,M_trans,col1,ren1);
printf("\nTranspuesta M1: \n");
imprimir_M(M_trans,col1,ren1);
transpuesta_M(M2,M_trans,col2,ren2);
printf("\nTranspuesta M2: \n");
imprimir_M(M_trans,col2,ren2);

//Suma y resta de M1 y M2
    if(validarCuadratura(ren1,ren2,col1,col2))
    {
        sumar_M(M1,M2,M_suma,ren1,col1);
        printf("\nM1 + M2  = \n");
        imprimir_M(M_suma,ren1,col1);
        restar_M(M1,M2,M_resta,ren1,col1);
        printf("\nM1 - M2  = \n");
        imprimir_M(M_resta,ren1,col1);
    }
    else
    {
        printf("\nNo se pueden sumar o restar");
    }

//Multiplicacion
    if(ValidarMulti(col1,ren2))
    {
        multiplicar_M(M1,M2,M_multi,ren1,col1,col2);
        printf("\nM1 * M2  = \n");
        imprimir_M(M_multi,ren2,col1);
    }
    else
    {
        printf("\nNo se pueden multiplicar");
    }
}

void Inicializar_M(int matriz[R][C],int ren,int col)
{

     int i,j;
     for(i=0; i<ren; i++){
        for(j=0; j<col; j++){
            matriz[i][j]=rand()%11;
        }
     }
}

void imprimir_M(int matriz[R][C],int ren,int col)
{
int i,j;
    for( i=0; i<ren; i++){
        for(j=0; j<col; j++){
            printf("[%d] \t",matriz[i][j]);
        }
        printf("\n");
     }
}

void transpuesta_M(int matriz[R][C],int M_trans[R][C],int ren, int col)
{
	int i,j;

	for(i=0; i<ren; i++){
		for(j=0; j<col; j++){
			M_trans[j][i] = matriz[i][j];
		}
	}
}

int validarCuadratura(int ren1,int ren2, int col1,int col2)
{
    if(ren1==ren2&&col1==col2) return 1;
    else return 0;

}

int ValidarMulti(int col1,int ren2)
{
    if(col1==ren2) return 1;
    else return 0;
}

void sumar_M(int M1[R][C],int M2[R][C],int M_suma[R][C],int ren, int col)
{
    int i, j;

	for(i=0; i<ren; i++){
		for(j=0; j<col; j++){
			M_suma[i][j] = M1[i][j] + M2[i][j];
		}
	}
}

void restar_M(int M1[R][C],int M2[R][C],int M_resta[R][C],int ren, int col)
{
    int i, j;

	for(i=0; i<ren; i++){
		for(j=0; j<col; j++){
			M_resta[i][j] = M1[i][j] - M2[i][j];
		}
	}
}

void multiplicar_M(int M1[R][C],int M2[R][C],int M_multi[R][C],int ren, int col1,int col2)
{
    int i,j,k;

	for(i=0; i<ren; i++){
		for(j=0; j<col2; j++){
			for(k=0; k<col1; k++){
				M_multi[i][j] += M1[i][k]*M2[k][j];
			}
		}
	}
}
