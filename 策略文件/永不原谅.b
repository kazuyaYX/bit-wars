int i=1;
int k=1;
while((k<CUR)&&(i==1)){
  if(ENEMY[k]==0)
    i=0;
  k=k+1;
}
return i;