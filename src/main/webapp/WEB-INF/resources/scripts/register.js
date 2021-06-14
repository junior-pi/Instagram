window.addEventListener('DOMContentLoaded', () => {
    const registerForm = window.document.getElementById('registerForm');
    registerForm.onsubmit = () => {
        let inputs = registerForm.querySelectorAll('input');
        for (let i = 0; i < inputs.length; i++) {
            let input = inputs[i];
            if (input.dataset.regex !== undefined) {
                let regex = new RegExp(input.dataset.regex);
                let name = input.getAttribute('placeholder');
                if (!regex.test(input.value)) {
                    alert(`올바른 ${name}값을 입력해주세요.`);
                    input.focus();
                    return false;
                }
            }
        }
        if (registerForm['password'].value !== registerForm['passwordCheck'].value) {
            alert('비밀번호가 서로 일치하지 않습니다.');
            registerForm['passwordCheck'].focus();
            return false;
        }
        /*
        * if (registerFrom['securityCode'].value !== DB_securityCode {
        *       ~~
        *       return false;
        * }
        * */
    };
    let inputs = registerForm.querySelectorAll('input');
    for (let i = 0; i < inputs.length; i++) {
        let input = inputs[i];
        input.addEventListener('blur', () => {
            if (input.dataset.regex !== undefined) {
                let regex = new RegExp(input.dataset.regex);
                if (!regex.test(input.value)) {
                    input.style.backgroundColor = 'rgba(239,51,68,0.50)';
                    return false;
                } else {
                    input.style.backgroundColor = 'rgba(51,239,120,0.50)';
                }
            }
        })
    }

});