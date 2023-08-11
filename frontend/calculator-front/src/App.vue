<template>
  <h1>우린 최고야</h1>
  <input type="number" v-mdodel.number="num1" placeholder="숫자를 입력하세요">
  <button v-on:click="">+</button>
  <input type="number" v-model.number="num2" placeholder="숫자를 입력하세요">
  <div>{{ result }}</div>
</template>

<script setup>
import { ref } from 'vue';

const num1 = ref(0);
const num2 = ref(0);
const result = ref(0);

</script>

<style scoped></style>
