if(CUR==1)
  return 1;
else{
  int i=RANDOM(9);
  if(i==9)
    return 0;
  else
    return ENEMY[CUR-1];
}
