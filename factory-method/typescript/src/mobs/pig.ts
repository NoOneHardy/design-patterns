import {Mob} from './mob'

export class Pig implements Mob {
  spawn(): void {
    console.log('A pig has spawned!')
  }

  walk(): void {
    console.log('The pig is walking.')
  }

  eat(): void {
    console.log('The pig is eating a carrot.')
  }
}