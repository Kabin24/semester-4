
#package install 
#install.packages("tidyverse")
#install.packages("GGally")

# load package
library(tidyverse)
library(GGally)

#loading the dataset / to see data 
housing = read.csv("housing.csv")
View(housing)

# to check the data types 
glimpse(housing)


#data Wrangling 
summary(housing)


#check for Null values 
anyNA(housing)
colSums(is.na(housing))


#now fill up the missing values
housing <-housing %>%
  fill(total_bedrooms,.direction = "updown") %>%
  mutate(ocean_proximity = as.factor(ocean_proximity))
anyNA(housing)


#divide the dat  set into training and testing set
RNGkind(sample.kind = "Rounding")
set.seed(417)
idx <- sample(nrow(housing),nrow(housing)* 0.8)

housing_train <- housing[idx,]
housing_test <- housing[-idx,]


# correlation matrix and boxplots

ggcorr(housing_train,label = T ,hjust =1 ,layout.exp = 3)
boxplot(housing_train$median_house_value)


#model fitting let us use linear regression
model_all <- lm(median_house_value ~ housing_median_age + total_rooms+total_bedrooms + households+ median_income + ocean_proximity,data = housing_train)
summary(model_all)

#prediction part

housing_test$pred <- predict(model_all,housing_test)

hist(housing_test$pred)

plot(model_all)

library(MLmetrics)
RMSE(y_pred ) = housing_test$pred  ,y_true = housing_test$median_house_value)
hist(model_all$residuals)