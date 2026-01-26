import {Mob} from '../mobs/mob'

export abstract class Spawner {
  public spawnMob(): Mob {
    const mob: Mob = this.createMob()
    mob.spawn()
    return mob
  }

  public abstract createMob(): Mob
}