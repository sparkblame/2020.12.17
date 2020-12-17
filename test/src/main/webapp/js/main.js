$(document).ready(function () {
    $.ajax({
        type: "POST",
        url: "sendmessage.do",
        data: null,
        dataType: "json",
        success: function (response) {
            console.log(response.name)
            var options1 = {
                chart: {
                    type: 'bar'                          //指定图表的类型，默认是折线图（line）
                },
                title: {
                    text: '按商品销售统计'                 // 标题
                },
                xAxis: {
                    categories: response.name  // x 轴分类
                },
                yAxis: {
                    title: {
                        text: '销售金额（万元）'                // y 轴标题
                    },
                    tickPixelInterval: 10
                },
                series: [{
                    data: response.price
                }]
            };

            var chart = Highcharts.chart('container', options1);

        }
    });
    $.ajax({
        type: "POST",
        url: "sendTemperature.do",
        async:false,
        dataType: "json",
        success: function (response) {
            var series=[];
            var data=response.info;
            series=data;
            console.log(typeof series);
            console.log(series);
            var options2 = {
                chart: {
                    type: 'line'                          //指定图表的类型，默认是折线图（line）
                },
                title: {
                    text: '不同城市的月平均气温'                 // 标题
                },
                subtitle: {
                    text: "数据来源：WorldClimate.com"
                },
                xAxis: {
                    categories: ["一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"]  // x 轴分类
                },
                yAxis: {
                    title: {
                        tickInterval: 5,
                        text: '温度（°C）'                // y 轴标题
                    },
                    tickPixelInterval: 10
                },
                legend: {
                    layout: 'vertical',
                    align: 'right',
                    verticalAlign: 'middle'
                },
                series:series
                /*[
                    {
                        name : 'Berlin',
                        data : [-1.0, 0.3, 4.0, 8.0, 14.0, 16.0, 18.0, 17.0, 15.0, 9.0, 3.0, 1.0]},
                    {
                        name : 'London',
                        data : [4.0, 4.0, 6.0, 8.0, 12.0, 15.0, 17.0, 16.0, 15.0, 10.0, 7.0, 5.0]},
                    {
                        name : 'NewYork',
                        data : [0.0, 0.5, 6.0, 12.0, 16.0, 22.0, 25.0, 24.0, 21.0, 14.0, 9.0, 2.0]},
                    {
                        name : 'tokyo',
                        data : [7.0, 6.0, 9.9, 15.0, 18.0, 22.0, 25.0, 27.0, 24.0, 16.0, 14.0, 9.0]}]*/
            };
            var chart2 = Highcharts.chart('line', options2);
        }
    })

    $.ajax({
        type: "POST",
        url: "sendBrowser.do",
        async:false,
        dataType: "json",
        success: function (response) {
            var colors= Highcharts.getOptions().colors;
            var data = response.browser;
            var name = response.name;
            console.log(data,typeof data);
            var i;
            var dataLen = data.length;
            var browserData = [];
            for (i = 0; i < dataLen; i += 1) {
                // add browser data
                browserData.push({
                    name: name[i],
                    y: data[i].y,
                    color: colors[data[i].color]
                });
            }
            var options3 = {
                chart: {
                    type: 'pie'                          //指定图表的类型，默认是折线图（line）
                },
                title: {
                    text: '不同城市的月平均气温'                 // 标题
                },
                subtitle: {
                    text: "数据来源：WorldClimate.com"
                },
                yAxis: {
                    title: {
                        text: '温度（°C）'                // y 轴标题
                    },
                },
                series:[{
                    name:'Browsers',
                    data:browserData,
                    size:'60%',
                    dataLabels:{
                        formatter:function () {
                            return this.y?this.point.name:null;
                        },
                        color:'#ffffff',
                        distance:-30
                    }
                }]
            };
            var chart3 = Highcharts.chart('pie', options3);
        }
    })

});