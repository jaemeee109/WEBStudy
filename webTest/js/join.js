
  function join() {
  const id = document.getElementById('id').value.trim();
  const pw = document.getElementById('pw').value.trim();
  const name = document.getElementById('name').value.trim();
  const genderElems = document.getElementsByName('gender');
  const date = document.querySelector('input[name="date"]').value.trim();
  const phone = document.getElementById('phone').value.trim();
  const email = document.getElementById('email').value.trim();
  const address = document.getElementById('address').value.trim();

  let gender = '';
  let genderChecked = false;
  for(let i=0; i < genderElems.length; i++) {
    if(genderElems[i].checked) {
      gender = genderElems[i].value;
      genderChecked = true;
      break;
    }
  }

  if (!id || !pw || !name || !genderChecked || !date || !phone || !address) {
    alert('필수 항목을 모두 입력해주세요.');
    return;
  }

  const userData = { id, pw, name, gender, date, phone, email, address };

  localStorage.setItem('user', JSON.stringify(userData));

  alert('회원가입이 완료됐습니다  로그인 후 이용이 가능합니다');
  window.location.href = 'index.html';
}

