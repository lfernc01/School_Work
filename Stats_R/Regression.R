#Creating a linear model
datafile = read.csv("filename.csv")
data.model = lm(Response ~ Var1+Var2+Var3,data = datafile)

#Creating a linear model with interactions
data.model2 = lm(Response ~ Var1*Var2+Var1*Var3+Var2*Var3,data = datafile)


