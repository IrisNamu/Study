let target = document.querySelector("#dynamic"); //dynamic이라는 아이디 속성에 문서 개체를 선택하라


function randomString() {
    let StringArr = ["[열정적인]", "[도전을 즐기는]","[감각있는 개발자]", "[성실하게 끝까지 임하는]", "[밝고 명랑한]"]
    
    let selectString = StringArr[Math.floor(Math.random() * StringArr.length)];
    let selectStringArr = selectString.split("");

    return selectStringArr;
}

//타이핑 리셋
function resetTyping() {
    target.textContent = "";
    dynamic(randomString());
}


//모든 문자열이 다 나올때까지 반복
function dynamic(randomArr) {
    if (randomArr.length > 0) {
        target.textContent += randomArr.shift(); //배열 0번째 값을 빼서 맨뒤로 이동
        setTimeout(function () {
            dynamic(randomArr);
        }, 80); //0.08  초 간격으로 다시 호출
    } else {
        setTimeout(resetTyping, 2000);
    }
}

dynamic(randomString());

//커서 깜박임 효과
function blink() {
    target.classList.toggle("active");
}
setInterval(blink, 500);