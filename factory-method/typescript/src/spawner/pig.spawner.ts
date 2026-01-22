import {Mob} from '../mobs/mob'
import {Pig} from '../mobs/pig'
import {Spawner} from './spawner'

export class PigSpawner extends Spawner {
  public override createMob(): Mob {
    return new Pig()
  }
}