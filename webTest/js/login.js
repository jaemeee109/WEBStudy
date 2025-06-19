 
  var emp = {"id" : "kcs", "pw" : "5555", "name" : "김춘식"};
  function login(){
    var a = document.getElementById("id").value;
    var b = document.getElementById("pw").value;
    if (emp.id == a && emp.pw == b){
      if(emp.id == a && emp.pw == b){
        alert(emp.name + "님 환영합니다!");  // 팝업 띄우기
        window.location.href = "index.html";  // 홈 화면으로 이동 (경로는 맞게 수정)
    } else {
        alert("아이디 또는 비밀번호가 틀립니다.");
    }
}
}