




datasets:: mtcars
input <- mtcars[,c('mpg','cyl')]
print(tail(input))

png(file = "boxplot.png")

boxplot(mpg ~ cyl, data = mtcars,
        xlab = "Number of cylinders",
        ylab = "Miles per galon",
        main = "Mileage data",
        col = rainbow(5),
        horizontal = TRUE
)


dev.off()
# Give the chart file a name.
png(file = "boxplot.png")

# Plot the chart.
boxplot(mpg ~ cyl, data = mtcars, 
        xlab = "Number of Cylinders",
        ylab = "Miles Per Gallon",
        main = "Mileage Data")

# Save the file.
dev.off()

