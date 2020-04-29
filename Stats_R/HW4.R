#Question 1
setwd("/Users/lornafernandezciruela/documents/R")
tvadrecall = read.csv("TVADRECALL.csv")

attach(tvadrecall)
y = c(tvadrecall$NEUTRAL,tvadrecall$SEX,tvadrecall$VIOLENT)
violent = c(rep(0,108),rep(1,108),rep(0,108))
sex = c(rep(0,108),rep(0,108),rep(1,108))
df = as.data.frame(cbind(y,violent,sex))
tva.model <- lm(y~violent+sex)
summary(tva.model)



sex = as.factor(tvadrecall$SEX)
neutral = as.factor(tvadrecall$NEUTRAL)

x1 = "'violent'=1"
x2 = "'sex'=1"
df = as.data.frame(cbind(violent,sex,neutral))

lm(df~x1+x2)


#Question 3
bodyimage = read.csv("BODYIMAGE.csv")
bodyimage.model1 = lm(DESIRE ~ GENDER+SELFESTM+BODYSAT+IMPREAL+GENDER:IMPREAL+SELFESTM:IMPREAL+BODYSAT:IMPREAL,data = bodyimage)

bodyimage.model2 = lm(DESIRE ~ GENDER+SELFESTM+BODYSAT+IMPREAL,data = bodyimage)

anova(bodyimage.model1,bodyimage.model2)

#Question 4
boys10 = read.csv("BOYS10.csv")
boys10.model = lm(MAXOXY~AGE+HEIGHT+WEIGHT+CHEST, data = boys10)
summary(boys10.model)

cor(boys10[,c("AGE", "HEIGHT", "CHEST", "WEIGHT")])

#Question 5
boygirl = read.csv("BOYGIRL.csv")
chisq.test(boygirl$NUMBER, p=c(0.25,0.25,0.25,0.25))
chisq.test(boygirl$NUMBER, p=c(0.23795,0.24985,0.24985,0.26235))

  
#Question 6
ushouse = read.csv("USHOUSE.csv")
chisq.test(ushouse$SEATS,p=ushouse$USPROP)
fisher.test(ushouse$USPROP, prob)