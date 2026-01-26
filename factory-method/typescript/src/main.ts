import {Spawner} from './spawner/spawner'
import {ZombieSpawner} from './spawner/zombie.spawner'
import {Mob} from './mobs/mob'
import {PigSpawner} from './spawner/pig.spawner'

const spawner: Spawner | undefined = getRandomSpawner()
if (!spawner) throw new Error('No spawner available')

const mob: Mob = spawner.spawnMob()
mob.walk()

function getRandomSpawner(): Spawner | undefined {
  const spawners: Spawner[] = [
    new ZombieSpawner(),
    new PigSpawner()
  ]

  const randomIndex: number = Math.floor(Math.random() * spawners.length)
  return spawners[randomIndex]
}