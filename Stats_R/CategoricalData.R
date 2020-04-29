#Data given: expected proportions are of equal weight in the population. 
boygirl = read.csv("BOYGIRL.csv")
chisq.test(boygirl$NUMBER, p=c(0.25,0.25,0.25,0.25))
chisq.test(boygirl$NUMBER, p=c(0.23795,0.24985,0.24985,0.26235))

  
