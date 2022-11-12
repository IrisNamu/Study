

let canvas;
let ctx; //이미지를 그리는 변수
canvas = document.createElement("canvas")
ctx = canvas.getContext("2d") //2d를 ctx에 가져온다.

//사이즈 정하기
canvas.width = 800;
canvas.height = 500;
document.body.appendChild(canvas);

let townImage, userImage;

//유저 좌표
let userX = 900;
let userY = 600;

//이미지
function loadImage() {
    townImage = new Image();
    townImage.src = "imgs/town.png"

    userImage = new Image();
    userImage.src = "imgs/user.png"
}


//키보드이벤트 
//클릭한 버튼들을 저장해놓기
let keysDown = {}
function setupkeyboardListener() {
    document.addEventListener("keydown", function (event) {
        keysDown[event.keyCode] = true;
        console.log("키다운 객체에 들어간 값은", keysDown);
    });
    //버튼 누르고있다가 떼면 이제 사라져야함
    document.addEventListener("keyup", function (event){
        delete keysDown[event.keyCode]
        console.log("버튼 클릭후", keysDown);

    });
}

//좌표값 바뀌면 이동
//왼쪽 37 위 38 오른쪽 39 아래 40  엔터 13 스페이스바 32
function update(){
    if( 39 in keysDown){
        userX += 5; //움직이는 속도
    }
    if(37 in keysDown){
        userX -=5;
    }

    if(38 in keysDown){
        userY -=5;
    }

    if(40 in keysDown){
        userY +=5;
    }

    //캐릭터 바깥으로 안나가게  하려면?
    if(userX >=canvas.width -64){
        userX =canvas.width-64;
    }
    if(userX<=0 ){
        userX =0;
    }
    if(userY>=canvas.height-64 ){
        userY =canvas.height-64;
    }
    if(userY<=0 ){
        userY =0;
    }
}


//이미지 보이기 
//ui를 그리다 render
function render() {
    ctx.drawImage(townImage, 0, 0, canvas.width, canvas.height);

    ctx.drawImage(userImage, userX, userY);

}
//render 함수는 계속 보여줘야한다! 계속 호출하자
function main() {
   update(); //좌표값을 계속 업데이트 해줘야한다.
    render();
    requestAnimationFrame(main); 
    //rende하고 부르고 render...
}

//함수를 호출하자!
loadImage();
setupkeyboardListener();
main();


//방향키 누르면xy좌표 

