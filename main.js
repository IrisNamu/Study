let target = document.querySelector("#dynamic"); //dynamic이라는 아이디 속성에 문서 개체를 선택하라
let StringArr=["열정적인", "도전을 즐기는", "사랑하는 친구", "소중한 딸", "태권도 사범","그리고...","감각있는 개발자"]
let selectString=StringArr[Math.floor(Math.random()*StringArr.length)];

let selectStringArr= selectString.split("");

console.log(ramdomArr);
function dynamic(ramdomArr){
    if(randomArr.length>0){
        target.textContent +=randomArr.shift(); //배열 0번째 값을 빼서 맨뒤로 이동
        setTimeout(function(){
            dynamic(randomArr);
        },80);
    }
}

//커서 깜박임 효과
function blink() {
    target.classList.toggle("active");
}
setInterval(blink, 500);