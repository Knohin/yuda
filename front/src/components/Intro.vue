<template>
  <div>
    <h2>Intro</h2>
    <div>{{ value }}</div>
    <hello-world/>
  </div>
</template>

<script>
import HelloWorld from '@/components/HelloWorld'

export default {
  components: {HelloWorld},
  data () {
    return {
      value: 'wow'
    }
  }
}

</script>
