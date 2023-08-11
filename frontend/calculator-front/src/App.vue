<template>
  <h1>우린 최고야</h1>
  <input type="number" v-model.number="num1" placeholder="숫자를 입력하세요">
  <button v-on:click="accept">+</button>
  <input type="number" v-model.number="num2" placeholder="숫자를 입력하세요">
  <div>{{ result }}</div>
</template>

<script setup>
// axios를 import
import axios from 'axios';

// 동적인 값을 위해 ref import
import { ref } from 'vue';

const num1 = ref(0);
const num2 = ref(0);
const result = ref(0);

// 버튼이 클릭되면 동작하는 accept 함수 설정
const accept = function () {
  // axios.post의 두 번째 인자로 보낼 데이터 객체 생성
  const data = {
    num1: num1.value,
    num2: num2.value
  };

  // 서버로 데이터를 전송하는 POST 요청
  // api에 명세된 url에 접근하면 data를 전송한다.
  axios.post("http://localhost:8080/toy/add", data)
    .then(response => {
      // POST 요청 성공 시 로직
      console.log(response.data);
      // 서버로부터 받은 결과 값을 표시
      result.value = response.data.result;
    })
    // POST 요청 실패 시 로직
    .catch(error => {
      console.error(error);
    });
}
</script>

<style scoped></style>
