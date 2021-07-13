//存储所有的省份
let provinces

//存储所有的市
let cities

//存储所有的区
let countries

/**
 * 初始化省市区数据 数组
 */
function initData(){
    //创建北京市对象
    let beijingProvince = new Object();
    //北京市对象有provinceId和provinceName属性，分别表示省ID和省名称
    beijingProvince.provinceId = 1;
    beijingProvince.provinceName = "北京市";

    console.log(beijingProvince)



    let beijingCity = new Object();
    beijingCity.provinceId = 1;
    beijingCity.cityId = 1;
    beijingCity.cityName = "北京市";
    console.log(beijingCity)




    let chaoYang = new Object();
    chaoYang.provinceId = 1;
    chaoYang.cityId = 1;
    chaoYang.countryId = 1;
    chaoYang.countryName = "朝阳区";
    console.log(chaoYang)

    let dongCheng = new Object();
    dongCheng.provinceId = 1;
    dongCheng.cityId = 1;
    dongCheng.cityName = "北京市";
    dongCheng.countryId = 2;
    dongCheng.countryName = "东城区";

    let shangHaiProvince = new Object();
    shangHaiProvince.provinceId = 2;
    shangHaiProvince.provinceName = "上海市"

    let shangHaiCity = new Object();
    shangHaiCity.provinceId = 2;
    shangHaiCity.cityId = 1;
    shangHaiCity.cityName = "上海市"


    let huangPu = new Object();
    huangPu.provinceId = 2;
    huangPu.cityId = 1;
    huangPu.countryId = 1;
    huangPu.countryName = "黄浦区"

    let puDong = new Object();
    puDong.provinceId = 2;
    puDong.cityId = 1;
    puDong.countryId = 2;
    puDong.countryName = "浦东新区"


    let jiangsuProvince = new Object();
    jiangsuProvince.provinceId = 3;
    jiangsuProvince.provinceName = "江苏省";

    let nanJing = new Object();
    nanJing.provinceId = 3;
    nanJing.cityId = 1;
    nanJing.cityName = "南京市";

    let xuanwu = new Object();
    xuanwu.provinceId = 3;

    xuanwu.cityId = 1;
    xuanwu.countryId = 1;
    xuanwu.countryName = "玄武区";


    let qinHuai = new Object();
    qinHuai.provinceId = 3;
    qinHuai.cityId = 1;
    qinHuai.countryId = 2;
    qinHuai.countryName = "秦淮区";


    let suzhou = new Object();
    suzhou.provinceId = 3;
    suzhou.cityId = 2;
    suzhou.cityName = "苏州市";

    let huqiu = new Object();
    huqiu.provinceId = 3;
    huqiu.cityId = 2;
    huqiu.countryId = 1;
    huqiu.countryName = "虎丘区";

    let wuzhong = new Object();
    wuzhong.provinceId = 3;
    wuzhong.cityId = 2;
    wuzhong.countryId = 2;
    wuzhong.countryName = "吴中区";


    let guangdongProvince = new Object();
    guangdongProvince.provinceId = 4;
    guangdongProvince.provinceName = "广东省";

    let guangzhou = new Object();
    guangzhou.provinceId = 4
    guangzhou.cityId = 1;
    guangzhou.cityName = "广州市";

    let haizhu = new Object();
    haizhu.provinceId = 4;
    haizhu.cityId = 1
    haizhu.counryId = 1;
    haizhu.countryName = "海珠区";

    let baiyun = new Object();
    baiyun.provinceId = 4;
    baiyun.cityId = 1
    baiyun.counryId = 2;
    baiyun.countryName = "白云区";

    let shenzhen = new Object();
    shenzhen.provinceId = 4
    shenzhen.cityId = 2;
    shenzhen.cityName = "深圳市";

    let luohu = new Object();
    luohu.provinceId = 4;
    luohu.cityId = 2
    luohu.counryId = 1;
    luohu.countryName = "罗湖区";


    let nanshan = new Object();
    nanshan.provinceId = 4;
    nanshan.cityId = 2
    nanshan.counryId = 2;
    nanshan.countryName = "南山区";


    /*填充数据*/
    provinces = [beijingProvince, shangHaiProvince, jiangsuProvince, guangdongProvince];

    cities = [beijingCity, shangHaiCity, nanJing, suzhou, guangzhou, shenzhen];

    countries = [chaoYang,
        dongCheng,
        huangPu,
        puDong,
        xuanwu,
        qinHuai,
        huqiu,
        wuzhong,
        haizhu,
        baiyun,
        luohu,
        nanshan];
}

/**
 * 页面加载完成以后，调用initData()方法
 */
window.onload=function (){
    initData();

    //绑定省份
    for (let i = 0; i <provinces.length ; i++) {

        //创建option标签
        let optionElement = document.createElement("option");
        //给option标签的value属性复制
        optionElement.setAttribute("value",provinces[i].provinceId)
        optionElement.innerText=provinces[i].provinceName
        //通过id找到省的下拉框
        let provinceSelectElement = document.getElementById("provinceSelect");
        provinceSelectElement.append(optionElement);



    }



}

/**
 * 根据省份获取省下的城市
 */
function getCities(provinceId){
    console.log("用户选择的省份的id是"+provinceId)

    let citySelectElement = document.getElementById("citySelect");

    // 给id为citySelect下拉框添加option之前先要清空数据
    citySelectElement.innerHTML="<option value=\"0\" selected>请选择城市</option>"
    //遍历城市列表
    for (let i = 0; i <cities.length ; i++) {
        if (provinceId==cities[i].provinceId){
            console.log("城市的id"+cities[i].cityId)
            console.log("城市的name"+cities[i].cityName)

            //创建option标签
            let optionElement = document.createElement("option");
            //给option的value属性赋值
            optionElement.setAttribute("value",cities[i].cityId)
            //给option的文本赋值
            optionElement.innerText=cities[i].cityName
            citySelectElement.append(optionElement)
        }
    }
}
/**
 * 根据城市id获取区县
 */
function getCountries(cityId){
    console.log("用户选择的城市id是"+cityId)

    //如何获取下拉框选中的值:省id
    let provinceSelectElement = document.getElementById("provinceSelect");
    //获取下拉框选中的option的索引
    let optionSelectedIndex = provinceSelectElement.selectedIndex;
    let provinceId = provinceSelectElement.options[optionSelectedIndex].value;
    console.log("选择的省份是"+provinceSelectElement.options[optionSelectedIndex].innerText)
    let countrySelectElement = document.getElementById("countrySelect");
    //给id为countrySelect下拉框添加option之前先要清空数据
    countrySelectElement.innerHTML=" <option value=\"0\" selected>请选择区县</option"
    //遍历所有的区县
    for (let i = 0; i < countries.length; i++) {
        //区县有对应的市id(cityId)和省id(provinceId)
        //cityId和方法传入的参数:cityId相等
        //provinceId和用户选中的省份的provinceId相等
        if (countries[i].cityId==cityId && countries[i].provinceId==provinceId){
            let optionElement = document.createElement("option");
            optionElement.setAttribute("value",countries[i].countryId)
            optionElement.innerHTML=countries[i].countryName
            countrySelectElement.append(optionElement)
        }

    }
}



