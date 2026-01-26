import {Spawner} from './spawner'
import {Mob} from '../mobs/mob'
import {Zombie} from '../mobs/zombie'
import {Material} from '../items/material'

export class ZombieSpawner extends Spawner {
  public override createMob(): Mob {
    const zombie: Zombie = new Zombie()
    zombie.equipArmor({
      helmet: Material.GOLD,
      chestplate: Material.IRON,
      leggings: Material.IRON
    })
    return zombie
  }
}