window.onload = function() {
  const savedUser = localStorage.getItem('user');
  if (savedUser) {
    const user = JSON.parse(savedUser);

    document.getElementById('displayId').innerText = user.id;
    document.getElementById('displayName').innerText = user.name;

    let genderText = '';
    if (user.gender === 'female') genderText = '여성';
    else if (user.gender === 'male') genderText = '남성';
    else genderText = '기타';

    document.getElementById('displayGender').innerText = genderText;

    document.getElementById('pw').value = user.pw;
    document.querySelector('input[name="date"]').value = user.date;
    document.getElementById('phone').value = user.phone;
    document.getElementById('email').value = user.email;
    document.getElementById('address').value = user.address;
  }
};

function join() {
 
  window.location.href = "../html/memberIndex.html";  
}

