def get_plot_data(data1, data2):
    x1 = data1//10
    y1 = data1 % 10

    x2 = data2//10
    y2 = data2 % 10
    res1 = (str(x1+x2) + str(y1+y2))
    res2 = str(abs(x1-x2))+str(abs(y1-y2))
    res3 = str(x1*x2)+str(y1*y2)
    print(res1, res2, res3)


x = int(input())
y = int(input())
get_plot_data(x, y)
