﻿var china = {};

var data=[{"id":"p1","alias":"Î÷²Ø","value":"80","level":"2"},{"id":"p2","alias":"Çàº£","value":"70","level":"3"},{"id":"p3","alias":"¸ÊËà","value":"60","level":"4"},{"id":"p4","alias":"ÐÂ½®","value":"90","level":"1"}];

<<<<<<< HEAD
var status="git";

var colors={"1":"#f2330c","2":"#f25c3e","3":"#f6a798","4":"#f9f"};
=======
var colors={"1":"#f2330c","2":"#f25c3e","3":"#f6a798","4":"#f9f222"};
>>>>>>> 34ad780f41fb824e73fd5e2c29661b4320f63691

function getAttr(id){
        var level;
        for(var k=0;k<data.length;k++){
            if(data[k]["id"]==id){
                level=data[k]["level"];
                break;
            }
        }
        var attr = {
        "fill": colors[level],
        "stroke": "#fff",
        "stroke-width": 1,
        "stroke-linejoin": "round"
        };
        return attr;
}

function paintMap(R) { 
    china.p1 = {
        path: R.path("M152.525,339.529l6.787,0.834l2.265,3.216l1.189,0.477l10.239-1.904l0.594-1.787l2.023-1.07l4.884-4.05l4.285-0.594l3.93-2.501l7.74-4.286l0.832,1.428l5.716,1.904l8.334-4.285l2.618,1.787l-2.379,3.452l0.952,0.833h3.332l0.359,1.427l-2.857,5.121l0.833,0.834h1.666l8.336,2.265l3.691-3.099l5.478,4.289l1.667-2.026l1.43,1.431h1.784l0.834-1.431l-0.356-6.549l1.429-0.835l3.451-4.284l-0.594-16.549l-3.099-8.337l2.265-1.665l-6.548-12.027l-7.979-6.311l-2.26,1.43l0.238,3.692l-6.908,8.931l-11.428-2.384l-0.833-4.286l-7.146-5.716l-15.717-2.498l-6.787-1.188l-2.619-0.241l-5.952-4.883l-12.385-2.857l-8.57-16.551l-0.238-4.642l3.451-1.672v-5.117l2.502-6.311l-2.858-2.858l3.811-3.095l-2.383-1.425h-5.716l-10.238-4.644h-6.549l-5.118,1.43h-5.715l-8.931,4.879l-7.144-0.834l-7.146,2.5l-5.954-1.906l-3.688-3.212l-9.526-1.427l-6.192,4.28l-3.45-1.425l-2.859-2.263l-6.908-1.667l-1.065-1.189l-2.857-0.237l-9.782,5.945l-10.412-1.297l2.428,4.398l2.68,1.995l-0.821,3.842l-0.231,3.758l0.256,2.672l0,0l-0.193,3.208l3.451,3.454l0.239,4.884l-1.072,1.907l-5.119,0.591l-2.621-2.854l-2.619,0.355l-0.476,2.265l1.428,3.688l0.479,2.62v3.333l-0.833,2.381l0.354,1.909l3.336,0.356l1.785,3.094l7.739,6.071v1.906l5.716,6.311l1.902,2.262l1.79,0.595l3.451-3.451l3.096,2.856c0,0,15.395,13.684,13.098,11.193c-2.297-2.491,2.381,5.715,2.381,5.715h2.859l1.667-1.665l1.426,1.428v5.117l7.741,4.287l1.667-0.357l1.191,4.287l6.548,3.81l0.238,2.501l1.188,0.835l5.717-0.24h3.098l4.644,3.457l10.24-0.359l5.476-0.239l1.428,2.265l-1.188,4.883l1.427,1.664l5.715-4.761l7.146-5.239l5.12,0.95L152.525,339.529z").attr(getAttr("p1"))
    };
    china.p2 = {
        path: R.path("M153.954,234.989l4.523,1.667l7.742-2.617l-1.193-1.429h-2.021l-0.834-2.259l0.594-2.024l3.692-1.668l2.617-4.286l-7.977-6.548l-0.356-6.906c0,0,2.08-2.545,3.689-2.856c1.609-0.313,26.317-5.119,26.317-5.119l1.783-1.428l3.931,0.594l13.215,3.095l3.93,2.265l5.714,3.451l3.692-0.237l5.714-3.452l7.501,1.188l4.882-2.616l9.999,6.309l5.36-2.023l2.856,6.903l6.907,4.286l5.119,4.527l3.691-1.431l7.146,9.405l1.426,6.071l2.619,3.688l-0.832,7.146l-5.715,4.524l1.073,2.856l-2.265,2.263l-2.856,2.62v4.879l-2.621,2.027l-3.097-0.954l-2.617-2.5l-1.431,2.859l1.787,2.499l4.524,0.594l4.287,4.288h2.618l2.024,2.265l-1.787,4.046v0.239l-3.688-0.479l-2.621,1.905l-1.666-2.856l-4.524,1.785l-1.19,2.264v3.451l-4.524,0.836l-5.715-5.716l-1.787-2.856l-4.524,1.428l-7.738-2.262l-11.67,1.666l-0.952,1.189l-1.071,3.69l-2.263,1.43l0.238,3.692l-6.906,8.931l-11.43-2.383l-0.833-4.285l-7.146-5.718l-15.717-2.498l-6.786-1.19l-2.621-0.238l-5.953-4.883l-12.384-2.857l-8.57-16.551l-0.238-4.642l3.451-1.672v-5.117l2.502-6.313l-2.858-2.856L153.954,234.989z").attr(getAttr("p2"))
    };
    china.p3 = {
        path: R.path("M196.462,200.108l-1.43-16.55l0.836-3.453l4.879-2.262c0,0,5.209-5.03,6.903-5.717c1.696-0.686,10.6-4.285,10.6-4.285l4.285-2.025v-4.047l1.905-2.262l1.788,0.237l7.144,1.192l-0.358,3.095l1.43,4.88l-0.834,7.978l6.072,8.929l3.097,2.026l4.883-3.812h10.237l2.623,0.953l1.429,2.264l-1.193,2.499l-5.714,4.645l0.597,2.261l6.549,4.882h2.618l0.834,1.07l-0.596,2.025l4.05,3.217l9.404,1.429l4.525-1.19l5.718-5.719l6.903,0.598l2.855,4.287l-1.664,3.929l0.475,2.382l-3.688,2.263l-1.668,2.024l0.596,4.763l6.545,4.646l2.875-0.653l7.725,9.458l1.668,7.145l-0.834,3.451l5.357,2.859v2.26l4.883,1.192h1.426v-4.05l3.693-0.595l0.951-4.763l-2.619-2.026l-2.025-2.021l0.834-9.166l2.023-1.071l3.453,1.43l1.432-0.598l0.834,1.667l9.166,4.639l4.883,3.1l0.832,2.856l-2.619,3.691l1.431,4.285l-0.834,2.021l-6.785,0.6l-1.433,0.833l0.478,1.191v1.903l-5.355,0.594l-2.856-1.428h-3.691l-0.596,0.834l0.596,2.024l-1.789,2.023l-0.592,2.262l3.449,2.857l-2.498,5.119l1.072,2.622l-0.238,1.188h-4.051l-2.854,1.435l2.26,3.091l-1.428,4.051l-4.287,1.07l0.357,2.023l-1.189,1.428l-7.383-0.596l-2.854-2.021l-0.601-4.525l-1.664-1.669l-2.62,1.669l-4.523-4.521l-3.455-2.385l-0.354-3.335l-1.074-2.619h-1.787l-7.144,3.096l0.356,3.454h-2.618l-4.287-4.288l-4.525-0.593l-1.786-2.499l1.431-2.86l2.617,2.5l3.097,0.954l2.62-2.025v-4.881l2.857-2.62l2.265-2.263l-1.073-2.856l5.716-4.522l0.832-7.147l-2.619-3.688l-1.429-6.071l-7.144-9.405l-3.692,1.431l-5.118-4.524l-6.907-4.287l-2.856-6.905l-5.359,2.023l-9.999-6.309l-4.883,2.616l-7.501-1.188l-5.714,3.452l-3.691,0.237l-5.715-3.451l-3.93-2.265L196.462,200.108z").attr(getAttr("p3"))
    };
    china.p4 = {
        path: R.path("M153.889,69.508l2.327-0.014l-1.428,4.525l2.025,2.38l0.236,1.666l4.525,4.524l1.191,3.453l5.953,0.357l2.62,2.265h1.429l3.453,7.379l3.451,8.931l-1.784,5.357l0.358,2.025l-3.215,5.477l0.833,4.286l11.192,4.763l12.025,1.788l12.503,8.571l4.049,1.429l0.237,2.261l2.619,5.478l2.619,7.146l3.333,5.953l-1.903,2.263v4.047l-4.286,2.026l-10.596,4.284l-6.907,5.719l-4.881,2.26l-0.834,3.453l1.43,16.55l-3.931-0.596l-1.783,1.431l-26.315,5.119l-3.691,2.856l0.358,6.906l7.978,6.548l-2.62,4.286l-3.69,1.668l-0.597,2.024l0.835,2.259h2.021l1.192,1.429l-7.738,2.617l-4.525-1.667l-2.382-1.424h-5.715l-10.24-4.642h-6.546l-5.121,1.428h-5.714l-8.931,4.879l-7.143-0.834l-7.145,2.5l-5.956-1.907l-3.689-3.211l-9.525-1.427l-6.191,4.28l-3.452-1.425l-2.858-2.263l-6.907-1.667l-1.07-1.189l-2.857-0.237l-9.782,5.945l-10.037-1.25l-0.822-0.359l1.113-8.623l-4.524-1.191l-9.406-6.902l-2.62-0.241l-2.023-4.525l1.427-4.643l-0.477-2.26l-3.451-2.266l-1.192-2.26l-7.143-4.049v-1.189l3.452-1.431l2.023,1.19l2.025-2.025l-0.598-6.785l0.598-5.716l-4.646-4.642l-3.095,0.833l-1.189-3.336l1.785-3.452l-0.952-3.214l3.038-2.749l1.248-1.182v-2.618l4.285-2.024l4.286-0.833l3.811-1.429l3.099,0.832l2.26-0.832l0.833,0.595l0.356,2.859l2.022,0.832l4.765-0.238c0,0,3.566-4.729,5.478-6.073c1.911-1.346,11.19,2.381,11.19,2.381l5.717-4.048l16.552-3.689l1.069-2.264l1.43-6.31l4.643-3.69h1.433v-1.906l0.236-15.836l0.833-3.212l-4.521-1.668l-0.24-1.191l4.762-1.428l12.384-1.073l1.905,2.501l4.287,0.952l1.192,0.239l1.665-2.262l-2.265-2.263l9.169-18.574l1.431-0.953l8.335,4.047h3.689l1.667,2.264l7.979-2.502l2.023-13.212l3.452-2.265l4.048-0.238l2.859-3.452l1.071-3.454l2.263-1.191L153.889,69.508z").attr(getAttr("p4"))
    };
}
