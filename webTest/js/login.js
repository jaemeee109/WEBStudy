function login() {
  var inputId = document.getElementById("id").value.trim();
  var inputPw = document.getElementById("pw").value.trim();

  var storedUser = localStorage.getItem('user');
  if (!storedUser) {
    alert("등록된 회원이 없습니다. 회원가입을 먼저 해주세요.");
    return;
  }

  var user = JSON.parse(storedUser);

  if (user.id === inputId && user.pw === inputPw) {
    alert(user.name + "님 환영합니다!");
    localStorage.setItem('isLogin', 'true'); // 로그인 상태 저장
    window.location.href = "../html/memberIndex.html";
  } else {
    alert("아이디 또는 비밀번호가 틀립니다.");
  }
}