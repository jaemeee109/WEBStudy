 if (localStorage.getItem('isLogin') !== 'true') {
    alert("로그인한 사용자만 접근할 수 있습니다.");
    window.location.href = "login.html"; 
  }
  document.getElementById("logoutBtn").addEventListener("click", function() {
  localStorage.removeItem('isLogin');  
  alert("로그아웃되었습니다.");
  window.location.href = "login.html";
});


  function qna() {
    alert("문의사항 접수가 완료되었습니다");
    window.location.href = "../html/memberIndex.html"; 
  }

  function cancleqna() {
    if (confirm("작성이 취소됩니다")) {
      window.location.href = "../html/memberIndex.html"; 
    }
  }
