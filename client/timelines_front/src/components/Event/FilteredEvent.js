
import { List, Button, Grid, Segment } from 'semantic-ui-react'
const FilteredEvent = ({filteredEvent, deleteEntry}) => {

    const deleteButton = () => {
        deleteEntry(filteredEvent.id)
    }

    return (
        <div>
            <Segment>
                <List.Content>
                    <List.Icon name='chess knight' />

                        <List.Header as='h3'>{filteredEvent.name}</List.Header>
                        <List.Content floated="right">{filteredEvent.date}</List.Content>
                        <List.Description>
                        {filteredEvent.description}
                        </List.Description>
                            <Button secondary onClick={deleteButton}>Delete Event</Button>

                </List.Content>
            </Segment>
        </div>
    )
}
export default FilteredEvent;