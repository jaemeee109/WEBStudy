document.addEventListener("DOMContentLoaded", () => {
  const loginBtn = document.getElementById("loginBtn");
  const logincontainer = document.getElementById("logincontainer");

  loginBtn.addEventListener("click", (e) => {
    e.preventDefault(); // 링크 기본동작 막기

    // 로그인 화면 HTML을 fetch해서 삽입 (경로에 맞게 수정하세요)
    fetch("test/login.html")
      .then(res => {
        if (!res.ok) throw new Error("로딩 실패: " + res.status);
        return res.text();
      })
      .then(html => {
        logincontainer.innerHTML = html;
      })
      .catch(err => {
        logincontainer.innerHTML = "<p>로그인 화면 로딩 중 오류가 발생했습니다.</p>";
        console.error(err);
      });
  });
});
