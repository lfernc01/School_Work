//exponential function
int powi(int x, int exp){
  int base = x;
  if(exp == 0) return(1);
  for(int i=1; i<exp; i++){
    base = base * x;
  }
  return(base);
}
