import {Mob} from './mob'
import {ArmorInventory} from '../armor/armor-inventory'

export class Zombie implements Mob {
  private armorInventory: ArmorInventory = {}

  spawn(): void {
    console.log('A zombie has spawned!')
  }

  walk(): void {
    console.log('The zombie is walking.')
  }

  public equipArmor(armor: ArmorInventory): void {
    this.armorInventory = {
      ...armor
    }
  }

  public getArmorInventory(): ArmorInventory {
    return this.armorInventory
  }
}