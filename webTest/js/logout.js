  document.getElementById('logoutBtn').addEventListener('click', function(event) {
    event.preventDefault(); 
   
    localStorage.removeItem('user');
    
   
    window.location.href = '../html/index.html';  
  });